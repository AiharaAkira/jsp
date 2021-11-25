package com.cmw.format;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class DataMaker {

	public static void make(HttpServletRequest request) {

		int a = 123456789;
		request.setAttribute("a", a);
		double b = 0.45;
		request.setAttribute("b", b);
		double c = 1232123.456456;
		request.setAttribute("c", c);
		String sName1 = "≤ø±Úƒ‹";
		int sPrice1 = 1000;
		String sName2 = "∞Ì∑°π‰";
		int sPrice2 = 2000;
		String sName3 = "ª©ª©∑Œ";
		int sPrice3 = 3000;
		
		Date d = new Date();
		request.setAttribute("d", d);
		
		//∞˙¿⁄(∞¥√º ø©∑Ø∞≥ ¿˙¿Â)
		//¿Ã∏ß, ∞°∞›, ¡¶¡∂¿œ
		
		
		
		ArrayList<Snack> snacks = new ArrayList<Snack>();
		snacks.add(new Snack(sName1, sPrice1, d));
		snacks.add(new Snack(sName2, sPrice2, d));
		snacks.add(new Snack(sName3, sPrice3, d));
		
		request.setAttribute("snacks", snacks);
		
	}

}
