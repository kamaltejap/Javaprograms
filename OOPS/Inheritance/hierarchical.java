package OOPS.Inheritance;

//If we derived multiple class in the presence of one base class is called hierarchical inheritance.
class A 
{
	public void m1()
	{
		System.out.println("M1-Method");
	}
}
class B extends A 
{
	public void m2()
	{
		System.out.println("M2-Method");
	}
}
class C extends A 
{
	public void m3()
	{
		System.out.println("M3-Method");
	}
}
public class hierarchical
{
	public static void main(String[] args)
	{
		A a=new A();
		a.m1();
		
		B b=new B();
		b.m1();
		b.m2();
		
		C c=new C();
		c.m1();
		c.m3();
	}
}
