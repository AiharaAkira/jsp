package com.cmw.main;

import javax.servlet.http.HttpServletRequest;

//M(model) - ����Ͻ� ����
// ���, DB 

public class M {

	public void calc(HttpServletRequest request) {
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));
	
	int c = a+b;
	
	//���� ���� cc�� v2�� ���� �� �ְ�
	request.setAttribute("ccc", c);
	}
}
