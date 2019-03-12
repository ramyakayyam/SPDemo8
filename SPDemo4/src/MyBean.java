import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyBean 
{
private Map<Integer,Double>products;
public void setProducts(Map<Integer, Double> products) {
	this.products = products;
}

public void printProductInfo()
{
	System.out.println("all products data is");
for(Map.Entry me:products.entrySet())
{
	System.out.println(me.getKey()+"----->"+me.getValue());
}
}
}
