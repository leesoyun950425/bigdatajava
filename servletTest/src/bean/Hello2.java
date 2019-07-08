package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.RepositoryIdHelper;


/*@WebServlet("/Hello")*/
public class Hello2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Hello2() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //text중에서 html로 보낼거야~
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title></title></head>");
		out.println("<body>");
		out.println("<h1>hi...</h1>");
		out.println("<h2>hi2...</h2>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
