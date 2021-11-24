package com.cmw.jstl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class BirthCal {

	

	public static void cal(HttpServletRequest request) {
		int birth = Integer.parseInt(request.getParameter("birth"));
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		int curYear = Integer.parseInt(sdf.format(d));
		int birthR = (curYear-birth+1);
		
		int ar[] = {1,3, 5,7,9};
		
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(new Menu("��ġ�", 6000));
		menus.add(new Menu("������", 7000));
		menus.add(new Menu("�c��ұ���", 10000));
		menus.add(new Menu("��Ÿ��", 13000));
		
		request.setAttribute("menus", menus);
		request.setAttribute("ar", ar);
		request.setAttribute("birth", birthR);
	}

}
