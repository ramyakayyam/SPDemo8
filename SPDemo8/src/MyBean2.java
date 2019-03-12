
public class MyBean2 
{
	private	int a;
	private String b;
	private float c;
	private SampleBean sb;
	//setters
	public void setA(int a) {
		this.a = a;
	}
	public void setB(String b) {
		this.b = b;
	}
	public void setSb(SampleBean sb) {
		this.sb = sb;
	}
	//bc
	public void wish1()
	{
		System.out.println("Welcome a="+a+" b="+b+"c="+c);
		sb.wish2();
	}
}

