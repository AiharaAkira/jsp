package com.cm.fu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/FileUpload")
public class FileUpload extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//1. 사용자가 보냊준 파일을 저장할 폴더 경로(절대경로로 써야함)
		//개발자 컴퓨터 말고 서버상의 경로
		String path = request.getSession().getServletContext().getRealPath("img");
		System.out.println(path);
		
		//파일 업로드 -> cos.jar
		MultipartRequest mr = new MultipartRequest(request, path, 
							30 * 1024 * 1024   //30mb 
							//파일 최대 허용용량(넘으면 예외) 단위는 바이트
				, "utf-8", 
				new DefaultFileRenamePolicy()); 
			// 서버는 나만쓰는게 아닌데, 파일명 중복되면 어쩔건지
			//a.jpg, a1.jpg, a2.jpg
		
		String name = mr.getParameter("n");
		System.out.println(name);
		
		//파일 읽을 때
		// 중복 안되게 처리한 것 때문에 올릴때의 파일 이름이 중요한게 아님 
		// 서버상에 실제로 올라간 파일명이 중요
		String file = mr.getFilesystemName("f");
		System.out.println(file);
		String etc = mr.getFilesystemName("e");
		System.out.println(etc);
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"utf-8\">");
		out.print("</head>");
		out.print("<body>");

		out.print("<h1>"+name+"</h1>");
		out.printf("<img src='img/%s' width=200px>", file);
		out.printf("<a href='img/%s'>사진보기</a>", file);
		out.printf("<a href='img/%s'>다운로드</a>", etc);
		
		
		
		out.print("</body>");
		out.print("</html>");
	}
	}


