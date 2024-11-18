package OOPS.Constuctor;

class Employee
{
	//current class variables 
	private int empId;
	private String empName;
	private double empSal;
	
	public Employee(int empId,String empName,double empSal)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	public void getEmployeeDetails()
	{
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Salary :"+empSal);
	}
}
public class parameterized {	public static void main(String[] args)
	{
		Employee e=new Employee(101,"Alan Morries",1000d);
		e.getEmployeeDetails();
	}
    
}
