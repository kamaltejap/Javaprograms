package OOPS.Inheritance;

//If we derived a class in the presence of one base class is called single level inheritance.
class A 
{
	public void m1()
	{
		System.out.println("M1-Method");
	}
}
class B  extends A 
{
	public void m2()
	{
		System.out.println("M2-Method");
	}
}
public class SingleLevel {
    public static void main(String[] args)
	{
		A a=new A();
		a.m1();
		
		B b=new B();
		b.m1();
		b.m2();
	}
    
}
