import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyBean 
{
private Properties  database;
public void setDatabase(Properties database) {
	this.database = database;
}
public void printDatabaseInfo()
{
	System.out.println("all database data is");
for(Map.Entry me:database.entrySet())
{
	System.out.println(me.getKey()+"---->"+me.getValue());
}
}
}
