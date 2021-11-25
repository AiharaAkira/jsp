package com.cmw.main;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Model {
	
	public static void print1(HttpServletRequest request) {
	
		//parameter = V에서 만든 값
		//String or String[] 어쨌든 String
		// 그게 req에 실려 넘어오는거
		
		//값을 읽을 때
		//java = req.getParameter("파라미터명");
		//EL = ${param.파라미터명}
		
		String aa = request.getParameter("a");
		
		//attribute = M(자바에서)
		//Object(자료형 제한x)
		//req에 실려서
		
		//값 읽을때
		//java = req.getAttribute("어트리뷰트명")
		//EL=${어트리뷰트명}
		
		String bb = (String) request.getAttribute("b");
	}
	
	public static void make1(HttpServletRequest request, HttpServletResponse response) {
		String bbb = "ㅋㅋㅋ";
		request.setAttribute("b", bbb);
		
		/*
		  사용하는 값(총4개)
		  param, attr
		  특징상 third에선 못씀
		  
		  Session, Cookie
		  session 
		  session.attribute(세션의 attr)
		   */
		String ccc = "세션!!!";
		
		HttpSession hs = request.getSession();
		hs.setMaxInactiveInterval(5); //세션 유지시간 5초
		hs.setAttribute("c", ccc);
		  
		//서버와 클라이언트의 연결상태
		//서버와 클라이언트의 연결만 살아있으면 
		//이사이트 어디에서든 사용 가능
		
		//연결이 끊어지면 못씀(접속 종료/브라우저 닫은거)
		//세션 유지시간(기본 30분)
		//시간내에 '요청'이 일어나지 않으면 죽음
		//시간 내에 '요청'등의 작업을 하면 갱신(유지시간 초기화)
		
		// cookie
		// 사용자 컴퓨터 파일 저장
		
		//쿠키도 시간 제한 걸 수 있음
		
		String ddd = "쿠키";
		Cookie coo = new Cookie("d", ddd);
		coo.setMaxAge(5*60); //5분
		
		response.addCookie(coo);
		
 	}


	public static void print2(HttpServletRequest request) {
		//session.attr(session의 attr)
		//M에서 만든 값
		//서버 -------------- 클라이언트 연결 상태에 담김
		//시간 제한 
		//Object
		
		//값 읽을 때
		//java = request.getSession().getAttribute("어트리뷰트명");
		//EL = ${sessionScope.어트리뷰트}
		String ccc = (String) request.getSession().getAttribute("c");
		
		
		//cookie
		//M에서 만든 값
		
		//클라이언트 컴터에 파일로 저장
		//접속을 끊어도 재부팅을 해도 살아 있음
		
		//값 읽을 떄
		//java: 현재 만들어져 있는 쿠키들
		Cookie[] cookies = request.getCookies();
		
		for (Cookie c : cookies) {
			System.out.println(c);
			if(c.getName().equals("d")) {
				System.out.println(c.getValue());
			}
		}
		
		//EL : ${cookie.쿠키이름.value}
	}
}
