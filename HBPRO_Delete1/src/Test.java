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
			Integer id=new Integer(101);
			session.load(p1,id);
			session.delete(p1);
			session.update(p1);
			System.out.println("object deleted successfully");
			tx.commit();
			session.close();
			sf.close();		
	}
}

