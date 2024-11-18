package OOPS.Encapsulation;

class Student 
{
	//current class variables 
	private int studId;
	private String studName;
	private double studFee;
	
	//setter methods 
	public void setStudId(int studId)
	{
		this.studId=studId;
	}
	public void setStudName(String studName)
	{
		this.studName=studName;
	}
	public void setStudFee(double studFee)
	{
		this.studFee=studFee;
	}
	
	//getter methods
	public int getStudId()
	{
		return studId;
	}
	public String getStudName()
	{
		return studName;
	}
	public double getStudFee()
	{
		return studFee;
	}
}
public class SetGetMethods {
    public static void main(String[] args)
	{
		Student s=new Student();
		s.setStudId(101);
		s.setStudName("Alan");
		s.setStudFee(1000d);
		
		System.out.println("Student Id :"+s.getStudId());
		System.out.println("Student Name :"+s.getStudName());
		System.out.println("Student Fee :"+s.getStudFee());
	}

    
}
