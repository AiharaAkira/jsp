package com.cmw.main;

import javax.servlet.http.HttpServletRequest;

public class M {

	public static void calc(HttpServletRequest request) {
		int earn = Integer.parseInt(request.getParameter("earn"));
		int spend = Integer.parseInt(request.getParameter("spend"));
		int result = earn - spend;
		Remain r = new Remain(earn, spend, result);
//		r.setEarn(earn); �⺻ �����ڷ� �������� ��
//		r.setEarn(spend);
//		r.setEarn(result);
		request.setAttribute("r", r);
		request.setAttribute("result", result);
	}

}
