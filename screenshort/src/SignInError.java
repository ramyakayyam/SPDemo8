import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignInError")
public class SignInError extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<h1 style='color:red'>invalid user</h1>");
		pw.println("<p><a href='login.html'>try again</a></p>");
		pw.println("<p><a href='reg.html'>new user</a></p>");
		pw.println("<p><a href='home.html'>home</a></p>");
	}

}