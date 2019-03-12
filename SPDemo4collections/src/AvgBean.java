
public class AvgBean 
{
private int num1,num2;

public AvgBean(int num1, int num2)
{
	this.num1 = num1;
	this.num2 = num2;
}


public void doAvg()
{
	System.out.println("Avg is:"+((num1+num2)/2));
}
}
