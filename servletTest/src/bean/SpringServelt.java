package bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet("/spring")*/
public class SpringServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SpringServelt() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("성공!");
	}
}
