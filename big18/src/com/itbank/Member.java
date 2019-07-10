package com.itbank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Member extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String admin;
	String id;
	String pw;
	PrintWriter out;
	
    public Member() {
    }

	public void init(ServletConfig config) throws ServletException {
		admin = config.getInitParameter("admin");
		System.out.println(admin);
		System.out.println("서블릿 시작.");
	}

	public void destroy() {
		System.out.println("서블릿 종료");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out = response.getWriter();
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		out.println("id : "+id);
		out.println("pw : "+pw);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
