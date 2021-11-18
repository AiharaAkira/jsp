package com.cmw.main;

import javax.servlet.http.HttpServletRequest;

public class M {

	public static void calc(HttpServletRequest request) {
		int earn = Integer.parseInt(request.getParameter("earn"));
		int spend = Integer.parseInt(request.getParameter("spend"));
		int result = earn - spend;
		Remain r = new Remain(earn, spend, result);
//		r.setEarn(earn); 기본 생성자로 생성했을 때
//		r.setEarn(spend);
//		r.setEarn(result);
		request.setAttribute("r", r);
		request.setAttribute("result", result);
	}

}
