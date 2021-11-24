package com.cmw.jstl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JSTLC")
public class JSTLC extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �Ķ���Ͱ� �ִ´� ���ε� �տ� !NOT�� �������� ������
		// ������´� �Ķ���Ͱ� ���ٴ� ��
		if (!request.getParameterNames().hasMoreElements()) {
			// ���� �Է¹ޱ� ���� �� ���(�Ķ���� ����, ��ǲ������)
			request.setAttribute("contentPage", "jstl/input.jsp");
		}else {
			BirthCal.cal(request);
			request.setAttribute("contentPage", "jstl/output.jsp");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
