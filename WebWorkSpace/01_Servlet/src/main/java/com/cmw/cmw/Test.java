package com.cmw.cmw;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test")
public class Test extends HttpServlet{
	
	/*
	 * 의미 : 기존 servlet의 기능 다 가지고 있고
	 * 내가 뭔가 추가해서 쓰겠다
	 * 
	 * servlet class : 기본적인거 다 만들어 주는거
	 * */
	
	
	
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		
		System.out.println("test");
	}
	
	
	
}
