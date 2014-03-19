package com.namoosori.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/HelloWorld2/result", "/greet"}) //여러개일때는 중괄호로 감싸주고 , 로 나눠서 붙여준다.어노테이션방식이다. web.xml에 일일이 수정 안해줘도 된다. 
public class HelloWorldServlet2 extends HttpServlet{

	
	private static final long serialVersionUID = 6012799604677813418L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doPost(req,resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		
		String paramName= req.getParameter("name");
		
		System.out.println(paramName);
		
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>인사</title>");
		writer.println("</head>");
		writer.println("<body>");

		writer.println("안녕하세요.");
		writer.println(paramName+"님!");
		
		
		writer.println("</body>");
		writer.println("</html>");
				
	}
	
}
