import java.util.Iterator;
import java.util.List;

public class MyBean 
{
private List<String>Studentname;
public void setStudentname(List<String> studentname) {
	this.Studentname = studentname;
}
public void printNames()
{
	System.out.println("==All student names are==");
	Iterator<String>it=Studentname.iterator();
	while(it.hasNext()) 
	{
		System.out.println(it.next());
	}
	
}


}
