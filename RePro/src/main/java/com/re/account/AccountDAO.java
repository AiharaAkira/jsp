package com.re.account;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.re.home.DBManager;

public class AccountDAO {

	public static void loginCheck(HttpServletRequest request) {

		HttpSession hs = request.getSession();
		AccountVO a = (AccountVO) hs.getAttribute("accountInfo");

		if (a == null) {
			// 로그인 실패
			System.out.println("로그인 실패");
			request.setAttribute("loginPage", "account/login.jsp");
		} else {
			// 로그인 성공
			System.out.println("로그인 성공");
			request.setAttribute("loginPage", "account/loginOk.jsp");
		}

	}
	
	public static void login(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("u_id");
		String userPw = request.getParameter("u_pw");
		System.out.println(userId);
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from account where u_id = ?";
			con = DBManager.connect();
			System.out.println("연결성공");
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String dbPW = rs.getString("u_pw");

				if (userPw.equals(dbPW)) {

					AccountVO a = new AccountVO();
					a.setU_id(rs.getString("u_id"));
					a.setU_pw(rs.getString("u_pw"));
					a.setU_name(rs.getString("u_name"));
					a.setU_nickName(rs.getString("u_nickname"));
					a.setU_profileImg(rs.getString("u_profileimg"));
					a.setU_typeOfManager(rs.getBigDecimal("u_typeOfManager"));
					a.setU_date(rs.getDate("u_date"));
					HttpSession hs = request.getSession();
					hs.setAttribute("accountInfo", a);
					hs.setMaxInactiveInterval(1800);

					System.out.println("로그인 성공");
				} else {
					System.out.println("비밀번호 오류");
				}
			} else {
				
				System.out.println("존재하지 않는 회원");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}

	}

	public static void logOut(HttpServletRequest request) {

		HttpSession hs = request.getSession();
		hs.setAttribute("accountInfo", null);

		request.setAttribute("loginPage", "account/login.jsp");
	}
	
	
	

	
}
