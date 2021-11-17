package com.cmw.main;

import javax.servlet.http.HttpServletRequest;

public class Exchange {

	public static void calc(HttpServletRequest request) {
		//값 받기
		int p = Integer.parseInt(request.getParameter("p"));
		int m = Integer.parseInt(request.getParameter("m"));
		int ex = m-p;
		String say = null;
		if(p < m) {
			say = "잔돈 여기 있습니다 ~";
		}else if(p > m) {
			say = "돈이 모자른데요?";
			
		}else {
			say = "감사합니다.";
		}
//		request.setAttribute("p", p);
//		request.setAttribute("m", m);
//		request.setAttribute("say", say);
//		request.setAttribute("ex", ex);
		
		// 위에 처럼 필요한 것들을 따로 실어서 보내도 되는데 
		// 한데 뭉쳐서 보내는거.(객체)
		
		Result r = new Result(p, m, ex, say);
		request.setAttribute("rr", r);
		
		
	}
}
