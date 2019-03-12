import org.hibernate.cfg.*;
import org.hibernate.*;
public class Test
{
	public static void main(String[] args)
	{
			Configuration cfg=new Configuration();
			cfg.configure("Product1.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session session =sf.openSession();
			Transaction tx=session.beginTransaction();
			Product1 p1=new Product1();
			Integer id=new Integer(1002);
			session.load(p1,id);
			p1.setName("laptop");
			p1.setCost(450.50);
			session.update(p1);
			System.out.println("object saved successfully");
			tx.commit();
			session.close();
			sf.close();		
	}
}

