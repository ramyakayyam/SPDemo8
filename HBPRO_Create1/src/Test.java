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
			p1.setId(101);
			p1.setName("mobile");
			p1.setCost(25000);
			session.save(p1);
			System.out.println("object saved successfully");
			tx.commit();
			session.close();
			sf.close();		
	}
}
