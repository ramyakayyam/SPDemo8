import org.hibernate.cfg.*;
import org.hibernate.*;
public class Test
{
	public static void main(String[] args)
	{
			Configuration cfg=new Configuration();
			cfg.configure("employee.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session session =sf.openSession();
			Transaction tx=session.beginTransaction();
			Employee p1=new Employee();
			p1.setId(101);
			p1.setFirstName("ramya");
			p1.setLastName("kayyam");
			session.save(p1);
			System.out.println("object saved successfully");
			tx.commit();
			session.close();
			sf.close();		
	}
}
