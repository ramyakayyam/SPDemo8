

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/S1")
public class S1 extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 
	 {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String v1=request.getParameter("n1");
		pw.println("hi:"+v1);
	}

}
