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
	      AddBean ob1=(AddBean)fac.getBean("id1");
	      ob1.sum();
	      System.out.println(ob1);
	    
		}
	}


