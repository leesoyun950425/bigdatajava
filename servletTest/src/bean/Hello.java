package bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.RepositoryIdHelper;


/*@WebServlet("/Hello")*/
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Hello() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post");
	}

	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("성공!");
	}
}
