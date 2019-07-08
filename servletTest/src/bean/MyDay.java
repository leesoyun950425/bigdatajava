package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/day.do")
public class MyDay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyDay() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String date = request.getParameter("date");
		String sub = request.getParameter("sub");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<p style='color:blue'>=========================================</p>");
		out.println("<h3 style='color:red'>오늘은 " +date+"입니다.</h3>");
		out.println("<h3 style='color:red'>오늘 나는 " +sub+"를 배우는 중입니다.</h3>");
		out.println("<p style='color:blue'>=========================================</p>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
