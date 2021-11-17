package com.cmw.main;

import javax.servlet.http.HttpServletRequest;

public class Year {

	public static void plusWord(HttpServletRequest request) {
		
		String birth = request.getParameter("birth");
		birth = birth + "³â";
		request.setAttribute("birth1", birth);
		
	}

}
