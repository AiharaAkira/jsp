package com.cmw.attr;

import javax.servlet.http.HttpServletRequest;

public class NoMoneyCal {
	 
	public static void cal(HttpServletRequest request) {
		
		int how = Integer.parseInt(request.getParameter("how"));
				
		how = Math.abs(how);
		request.setAttribute("how", how);
	}

}
