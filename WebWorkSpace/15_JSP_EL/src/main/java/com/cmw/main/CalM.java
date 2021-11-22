package com.cmw.main;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class CalM {

	public static void cal(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		double middle = Double.parseDouble(request.getParameter("middle")) ;
		double last = Double.parseDouble(request.getParameter("last"));
		double avg = (last + middle)/2;
		String grade = "";
		
		if(avg >= 90) {
			grade = "a";
		}else if(avg >= 80) {
			grade = "b";
		}else if(avg >= 80) {
			grade = "c";
		}else if(avg >= 80) {
			grade = "d";
		}else  {
			grade = "f";
		}
		
		String avg2 = String .format("%.2f", avg);
		
		Result r = new Result(name, middle, last, avg2, grade);
		request.setAttribute("r", r);
		//
		request.setAttribute("a", "akira");
		request.setAttribute("b", "hutao");
		
		int[] ar = {3, 6, 9};
		request.setAttribute("c", ar);
		
		Result[] ar2 = new Result[2];
		ar2[0] = new Result("hutao", 80, 90, "90", "A");
		ar2[1] = new Result("hutao", 80, 90, "100", "A");
		request.setAttribute("d", ar2);
		
		ArrayList<Result> al = new ArrayList<>();
		al.add(new Result("raiden", 80, 90, "100", "S"));
		al.add(new Result("hutao", 80, 90, "100", "S"));
		al.add(new Result("EULA", 80, 90, "100", "S"));
		request.setAttribute("e", al);
	}

}
