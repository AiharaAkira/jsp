package com.cmw.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NoMoney")
public class NoMoney extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�ƹ����� �ᵵ ��
		NoMoneyCal.cal(request);
		request.getRequestDispatcher("output3.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//500���� �߰� ó���Ұ� ����. �׳� ��� �������� �� �����ֱ⸸ �ϸ� ��.
		
		request.getRequestDispatcher("output3.jsp").forward(request, response);
	}

}
