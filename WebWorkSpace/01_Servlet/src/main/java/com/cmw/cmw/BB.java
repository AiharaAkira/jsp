package com.cmw.cmw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@xxx : anotaion - �ڵ����� ���� ���� 

//servlet 2.x�� ��� 3.0dlgnqnxjs @WebServlet ��밡��

//Tomcat 5.0 ���� : ��Ĺ �������Ͽ� ���� ���

@WebServlet("/BB")
public class BB extends HttpServlet {
	
	// ������̼� ���ǻ���
	//1. �����ص� ���� �ȹٲ���. ����ó���ؾߵ�
	//2. �����ͷ� �ٲ㵵 �ȹٲ���. ����ó��
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"euc-kr\">");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>hello world �ȳ� ٥������</h1>");
		out.print("</body>");
		out.print("</html>");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
