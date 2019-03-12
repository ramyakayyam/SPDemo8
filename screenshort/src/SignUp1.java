import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbcon.MyCon;

@WebServlet("/SignUp")
public class SignUp1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		//1.Read form paramater
		String s1=request.getParameter("n1");
		String s2=request.getParameter("n2");
		String s3=request.getParameter("n3");
		String s4=request.getParameter("n4");
		//2.Prepare JDBC Code to insert record
		String sq="select userid from user_reg where userid=?";
		String iq="insert into user_reg values(?,?,?,?)";
	    try
		{
			Connection con=MyCon.getMyCon();
			PreparedStatement pst1=con.prepareStatement(sq);
			PreparedStatement pst2=con.prepareStatement(iq);
			pst1.setString(1, s2);
			ResultSet rs=pst1.executeQuery();
			if(rs.next())
			{
				response.sendRedirect("SignUpError");
			}
				else
				{
				pst2.setString(1,s1);
				pst2.setString(2,s2);
				pst2.setString(3,s3);
				pst2.setString(4,s4);
				int r=pst2.executeUpdate();
				if(r>0)
				{
					request.setAttribute("k", s2);
					RequestDispatcher rd=request.getRequestDispatcher("SignUpSuccess");
					rd.forward(request, response);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("--SignUp Servelt Catch Block--");
			e.printStackTrace();
		}

	}
}