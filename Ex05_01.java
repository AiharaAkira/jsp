package com.javalec.exjsp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HWorld")
public class Ex05_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Ex05_01() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doget");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("dopost");
		
		response.setContentType("text/html; chaarset=euc-kr");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>포스트방식입니다dopost메소드 호출 되었습니다.</h1>");
		writer.println("</body>");
		writer.println("</html>");

		
	}

}
