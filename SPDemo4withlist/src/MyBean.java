import java.util.Iterator;
import java.util.List;

public class MyBean 
{
private List<String>StudentNames; 
public void setStudentNames(List<String> studentNames) {
	this.StudentNames = studentNames;
}
public void printNames()
{
	System.out.println("==all student names are==");
	Iterator<String>it=StudentNames.iterator();
	while(it.hasNext())
	{
		System.out.println(it.hasNext());
	}
}
}
