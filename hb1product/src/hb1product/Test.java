package hb1product;
import org.hibernate.cfg.*;
import org.hibernate.*;
public class Test
{
	public static void main(String[] args)
	{
			Configuration cfg=new Configuration();
			cfg.configure("hb1product/product.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session session =sf.openSession();
			Transaction tx=session.beginTransaction();
			Product p1=new Product();
			p1.setPid(1001);
			p1.setPname("mobile");
			p1.setPcost(10000);
			session.save(p1);
			System.out.println("object saved successfully");
			tx.commit();
			session.close();
			sf.close();		
	}
}
