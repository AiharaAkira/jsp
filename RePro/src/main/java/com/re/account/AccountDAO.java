package com.re.account;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.re.home.DBManager;

public class AccountDAO {

	public static void signUp(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "insert into account values (?,?,?,?,?,?,sysdate)";

		try {
			con = DBManager.connect();
			pstmt = con.prepareStatement(sql);

			String path = request.getSession().getServletContext().getRealPath("file");
			MultipartRequest mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "utf-8",
					new DefaultFileRenamePolicy());

			String u_id = mr.getParameter("u_id");
			String u_pw = mr.getParameter("u_pw");
			String u_pwR = SHA256.encodeSha256(u_pw);
			String u_name = mr.getParameter("u_name");
			String u_nickName = mr.getParameter("u_nickName");
			String u_profileImg = mr.getFilesystemName("u_profileImg");
			String u_typeOfManager = mr.getParameter("u_typeOfManager");

			pstmt.setString(1, u_id);
			pstmt.setString(2, u_pwR);
			pstmt.setString(3, u_name);
			pstmt.setString(4, u_nickName);
			pstmt.setString(5, u_profileImg);
			pstmt.setString(6, u_typeOfManager);

			
			if (pstmt.executeUpdate() == 1) {

				System.out.println("등록 성공");
			} else {
				System.out.println("등록 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("db 서버오류");
		} finally {
			DBManager.close(con, pstmt, null);
		}

	}

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
		String userPwR = SHA256.encodeSha256(userPw);
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from account where u_id = ?";
			con = DBManager.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String dbPW = rs.getString("u_pw");

				if (userPwR.equals(dbPW)) {

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

	public static void update(HttpServletRequest request) throws UnsupportedEncodingException {

		request.setCharacterEncoding("UTF-8");

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBManager.connect();

			String path = request.getSession().getServletContext().getRealPath("file");
			MultipartRequest mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "utf-8",
					new DefaultFileRenamePolicy());

			String sql = "update account set u_pw=?, u_name=?, u_nickName=?, u_profileImg=? " + " where u_id=?";

			if (mr.getFilesystemName("u_profileImg") == null) {

				sql = "update account set u_pw=?, u_name=?, u_nickName=?" + "where u_id=?";
				pstmt = con.prepareStatement(sql);

				String u_id = mr.getParameter("u_id");
				String u_pw = mr.getParameter("u_pw");
				String u_pwR = SHA256.encodeSha256(u_pw);
				String u_name = mr.getParameter("u_name");
				String u_nickName = mr.getParameter("u_nickName");

				pstmt.setString(1, u_pwR);
				pstmt.setString(2, u_name);
				pstmt.setString(3, u_nickName);
				pstmt.setString(4, u_id);

				if (pstmt.executeUpdate() == 1) {

					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}

				DBManager.close(con, pstmt, null);

				return;
			}

			pstmt = con.prepareStatement(sql);

			String u_id = mr.getParameter("u_id");
			String u_pw = mr.getParameter("u_pw");
			String u_pwR = SHA256.encodeSha256(u_pw);
			String u_name = mr.getParameter("u_name");
			String u_nickName = mr.getParameter("u_nickName");
			String u_profileImg = mr.getFilesystemName("u_profileImg");

			
			pstmt.setString(1, u_pwR);
			pstmt.setString(2, u_name);
			pstmt.setString(3, u_nickName);
			pstmt.setString(4, u_profileImg);
			pstmt.setString(5, u_id);

			if (pstmt.executeUpdate() == 1) {

				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("db 서버오류");
		} finally {
			DBManager.close(con, pstmt, null);
		}

	}

	public static void delete(HttpServletRequest request) throws UnsupportedEncodingException {

		request.setCharacterEncoding("UTF-8");

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBManager.connect();

			String sql = "delete from account where u_id = ? and u_name = ? and  u_nickName = ?";

			pstmt = con.prepareStatement(sql);

			String u_id = request.getParameter("u_id");
			String u_name = request.getParameter("u_name");
			String u_nickName = request.getParameter("u_nickName");

			pstmt.setString(1, u_name);
			pstmt.setString(2, u_nickName);
			pstmt.setString(3, u_id);

			if (pstmt.executeUpdate() == 1) {

				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("db 서버오류");
		} finally {
			DBManager.close(con, pstmt, null);
		}

	}

}
