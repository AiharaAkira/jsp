package com.cmw.main;

import javax.servlet.http.HttpServletRequest;

public class Exchange {

	public static void calc(HttpServletRequest request) {
		//�� �ޱ�
		int p = Integer.parseInt(request.getParameter("p"));
		int m = Integer.parseInt(request.getParameter("m"));
		int ex = m-p;
		String say = null;
		if(p < m) {
			say = "�ܵ� ���� �ֽ��ϴ� ~";
		}else if(p > m) {
			say = "���� ���ڸ�����?";
			
		}else {
			say = "�����մϴ�.";
		}
//		request.setAttribute("p", p);
//		request.setAttribute("m", m);
//		request.setAttribute("say", say);
//		request.setAttribute("ex", ex);
		
		// ���� ó�� �ʿ��� �͵��� ���� �Ǿ ������ �Ǵµ� 
		// �ѵ� ���ļ� �����°�.(��ü)
		
		Result r = new Result(p, m, ex, say);
		request.setAttribute("rr", r);
		
		
	}
}
