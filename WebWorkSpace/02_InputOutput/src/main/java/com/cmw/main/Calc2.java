package com.cmw.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Calc2")
public class Calc2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		String[] c = request.getParameterValues("c");
		double result = 0;
		
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"utf-8\">");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>h1테이블 파일</h1>");
		out.print("<table border=\"3\" style=\"width : 400px; height: 300px \">");
		
		
		
		for (String s : c) {
			if(s.equals("+")) {
				result = x + y;
			}else if(s.equals("-")) {
				result = x - y;
			}else if(s.equals("*")) {
				result = x * y;
			}else {
				result = (double)x / y;
			}
			
			out.printf("<tr><td> %d %s %d = %.1f </td></tr>",  x, s, y, result);
			
		}
		

		out.print("</table>");
		
		out.print("</body>");
		out.print("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
