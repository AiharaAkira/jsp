package com.cmw.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class reg extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String adress = request.getParameter("adress");
		String[] fav= request.getParameterValues("fav");
		String intro = request.getParameter("introduce");
		
		
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"utf-8\">");
		out.print("</head>");
		out.print("<body>");
		
		out.print("<table border=\"1\" style=\"text-align:center; background-color:gray; color:white; border-radius:5px\" >\r\n"
				+ "			<tr>\r\n"
				+ "				<td colspan=\"2\">ȸ������</td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td>�̸�</td><td>"+name+"</td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td>���̵�</td><td>"+id+"</td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td>��й�ȣ</td><td>"+pw+"</td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td>����</td><td>"+gender+"</td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td>�ּ�</td>\r\n"
				+ "				<td>"+adress+"</td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n<td>���ɻ�</td><td>");
				for (String string : fav) {
					out.print(string+"   ");
				}
				
				out.print(				
						"</td>\r\n</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td>�ڱ�Ұ�</td>\r\n"
				+ "				<td>"+intro+"</td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td colspan=\"2\"><button>�����ϱ�</button></td>\r\n"
				+ "			</tr>\r\n"
				+ "			\r\n"
				+ "		</table>");		
		out.print("</body>");
		out.print("</html>");
	}
	
	}

