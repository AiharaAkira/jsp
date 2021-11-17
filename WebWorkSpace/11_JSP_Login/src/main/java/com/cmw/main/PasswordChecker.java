package com.cmw.main;

import javax.servlet.http.HttpServletRequest;

public class PasswordChecker {

	public static void check(HttpServletRequest request) {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pwOk = request.getParameter("pwOk");
		
		pw = "****************";
		pwOk = "****************";
		
		Result r = new Result(name, id, pw, pwOk);
		request.setAttribute("r", r);
	}

}
