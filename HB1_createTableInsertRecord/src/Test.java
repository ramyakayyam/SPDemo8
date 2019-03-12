import org.hibernate.*;   
import org.hibernate.cfg.*;
public class Test
{
public static void main(String[] args)
{
	Configuration cfg=new Configuration();
	cfg.configure("product.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	Product p1=new Product();
	p1.setPid(1001);
	p1.setPname("laptop");
	p1.setpcost(25000);
	session.save(p1);
	System.out.println("object saved successfully");
	tx.commit();
	session.close();
	sf.close();
}
}
