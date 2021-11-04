package com.cmw.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//post 메소드 : iso8859-1 인코딩을함
//get 방식 : UTf-8

@WebServlet("/LogIn")
public class LogIn extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();
		
		String id = "cmw";
		String pw = "3939";
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"euc-kr\">");
		out.print("</head>");
		out.print("<body>");
		
		if(uid.equals(id) && upw.equals(pw)) {
			out.print("<h1 style=\"color: red;\">로그인 성공!</h1><br>");
			out.print("<h1>id:"+uid+"<br>  pw:"+upw+"</h1>");
		}else if(uid.equals(id) && !upw.equals(pw)) {
			out.print("<h1 style=\"color: red;\">비밀번호 오류</h1>");
		}else if(!uid.equals(id) && upw.equals(pw)) {
			out.print("<h1 style=\"color: red;\">아이디 오류</h1>");
		}else {
			out.print("<h1 style=\"color: red;\">회원정보가 존재하지 않습니다.</h1>");
		}
		
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//포스트방식 한글 처리할때 
		request.setCharacterEncoding("utf-8");
		
		
		response.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();
		
		String id = "cmw";
		String pw = "3939";
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"euc-kr\">");
		out.print("</head>");
		out.print("<body>");
		
		if(uid.equals(id) && upw.equals(pw)) {
			out.print("<h1 style=\"color: red;\">로그인 성공!</h1><br>");
			out.print("<h1>id:"+uid+"<br>  pw:"+upw+"</h1>");
		}else if(uid.equals(id) && !upw.equals(pw)) {
			out.print("<h1 style=\"color: red;\">비밀번호 오류</h1>");
		}else if(!uid.equals(id) && upw.equals(pw)) {
			out.print("<h1 style=\"color: red;\">아이디 오류</h1>");
		}else {
			out.print("<h1 style=\"color: red;\">회원정보가 존재하지 않습니다.</h1>");
		}
		
		out.print("</body>");
		out.print("</html>");
		
		
	}

}
