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
		
		
		//1. ����ڰ� ���T�� ������ ������ ���� ���(�����η� �����)
		//������ ��ǻ�� ���� �������� ���
		String path = request.getSession().getServletContext().getRealPath("img");
		System.out.println(path);
		
		//���� ���ε� -> cos.jar
		MultipartRequest mr = new MultipartRequest(request, path, 
							30 * 1024 * 1024   //30mb 
							//���� �ִ� ���뷮(������ ����) ������ ����Ʈ
				, "utf-8", 
				new DefaultFileRenamePolicy()); 
			// ������ �������°� �ƴѵ�, ���ϸ� �ߺ��Ǹ� ��¿����
			//a.jpg, a1.jpg, a2.jpg
		
		String name = mr.getParameter("n");
		System.out.println(name);
		
		//���� ���� ��
		// �ߺ� �ȵǰ� ó���� �� ������ �ø����� ���� �̸��� �߿��Ѱ� �ƴ� 
		// ������ ������ �ö� ���ϸ��� �߿�
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
		out.printf("<a href='img/%s'>��������</a>", file);
		out.printf("<a href='img/%s'>�ٿ�ε�</a>", etc);
		
		
		
		out.print("</body>");
		out.print("</html>");
	}
	}

