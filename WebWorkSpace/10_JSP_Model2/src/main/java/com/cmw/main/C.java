package com.cmw.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//controller - ��������
//��Ȳ �Ǵ��ؼ� �ʿ��� ������ ����


//������Ʈ�� ������
@WebServlet("/C")
public class C extends HttpServlet {
	//�ּҸ� �ļ� �����ϰų� Ŭ���ؼ� ���� ���
	//� ����Ʈ�� ó�� ���� ��� : GET��� ��û
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//get��� ��û ������ v.html�� ������
		request.getRequestDispatcher("view.html").forward(request, response);
		//response.sendRedirect("view.html");
		//���� ���� ��� �ᵵ �Ǵµ� ���߿� �� forward�� ó���ϴϱ�
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		M m = new M();
		m.calc(request);
		
		request.getRequestDispatcher("v2.jsp").forward(request, response);
		
	}

}