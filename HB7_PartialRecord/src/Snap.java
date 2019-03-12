import java.util.Iterator;
import java.util.List;

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
		Query q= session.createQuery("select c.name from camera c where c.cid=1001");
		List li=q.list();
		Iterator<Camera> it=li.iterator();
	    System.out.println("==All camera names are==");
		while(it.hasNext())
		{
			System.out.println("---------------------");
		System.out.println("Name="+it.next());
		}
		tx.commit();
		session.close();
		sf.close();
	}
}


