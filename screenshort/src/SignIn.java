import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbcon.MyCon;

@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		//1.Read form paramater
		String s1=request.getParameter("n1");
		String s2=request.getParameter("n2");
		//2.Prepare JDBC Code to insert record
          String sq="select userid,password from user_reg where userid=? and password=?";
	    try
		{
			Connection con=MyCon.getMyCon();
			PreparedStatement pst1=con.prepareStatement(sq);
			pst1.setString(1, s1);
			pst1.setString(2, s2);
			ResultSet rs=pst1.executeQuery();
			if(rs.next())
				
			{
				HttpSession hs=request.getSession();
				hs.setAttribute("key1",s1);
				response.sendRedirect("SignInSuccess");
				}
			else
			{
				response.sendRedirect("SignUpError");
			}
			con.close();
			pst1.close();
		}
		catch(Exception e)
		{
			System.out.println("--SignIn Servelt Catch Block--");
			e.printStackTrace();
		}

	}

}
