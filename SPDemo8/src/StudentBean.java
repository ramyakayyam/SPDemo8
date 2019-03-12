
public class StudentBean 
{
private int rollno;
private String name;
private AddressBean ad;
public void setRollno(int rollno) {
	this.rollno = rollno;
}

public void setName(String name) {
	this.name = name;
}

public void setAd(AddressBean ad) {
	this.ad = ad;
}
public void printStudentInfo()
{
	System.out.println("Rollno="+rollno+"name="+name);
	ad.printAddress();
}
}
