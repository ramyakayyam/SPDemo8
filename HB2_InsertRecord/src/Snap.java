import org.hibernate.*;   
import org.hibernate.cfg.*;
public class Snap 
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure("camera.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Camera c1=new Camera();
		c1.setCid(1001);
		c1.setCname("nikon");
		c1.setcprice(45000);
		session.save(c1);
		System.out.println("object saved successfully");
		tx.commit();
		session.close();
		sf.close();
	}
	}

