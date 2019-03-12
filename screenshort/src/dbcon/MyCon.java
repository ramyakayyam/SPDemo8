package dbcon;
import java.sql.Connection;
import java.sql.DriverManager;


public class MyCon 
{
	static Connection con=null;
	public static Connection getMyCon()
	{
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE","ramya","kayyam");
		} 
		catch (Exception e) 
		{
			System.out.println("---MyCon class catch---");
			e.printStackTrace();
		}
		return con;
	}
}