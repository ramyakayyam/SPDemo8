interface Trainer
{
	void teaching();
}
class JavaTriner implements Trainer
{
	public void teaching()
	{
		System.out.println("core,advance & frameworks");
	}
}
class Institute
{
	Trainer t;
	public void setT(Trainer t)
	{
		this.t=t;
	}
	public void startCourse()
	{
		t.teaching();
	}
}
public class Sample {

	public static void main(String[] args) {

		JavaTriner chanti=new JavaTriner();
		Institute tg=new Institute();
		tg.setT((Trainer) chanti);
		tg.startCourse();
	}

}
