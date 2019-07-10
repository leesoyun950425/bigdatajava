package com.itbank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String driver;
	
    public Hello() {
    }

	public void init(ServletConfig config) throws ServletException { //생성자의 파라메터 
		driver = config.getInitParameter("driver");
	}

	public void destroy() {  //사라질때 호출되는 메소드
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("your driver : "+driver);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
