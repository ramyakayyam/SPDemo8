import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test
{
	public static void main(String[] args) 
		{
		 Resource res=new ClassPathResource("myconfig.xml");
	      BeanFactory fac=new XmlBeanFactory(res);
	      MyBean ob1=(MyBean)fac.getBean("id1");
	      ob1.printRollnos();
	      System.out.println(ob1);
	    
		}
	}


