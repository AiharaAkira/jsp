package com.cmw.main;

import javax.servlet.http.HttpServletRequest;

//M(model) - 비즈니스 로직
// 계산, DB 

public class M {

	public void calc(HttpServletRequest request) {
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));
	
	int c = a+b;
	
	//여기 나온 cc를 v2로 보낼 수 있게
	request.setAttribute("ccc", c);
	}
}
