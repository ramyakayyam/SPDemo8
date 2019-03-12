import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyBean 
{
private Set<Integer>studentrollnos;
public void setStudentrollnos(Set<Integer> studentrollnos) {
	this.studentrollnos = studentrollnos;
}

public void printRollnos()
{
	System.out.println("all students data is");
Iterator<Integer>it=studentrollnos.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
}


}
