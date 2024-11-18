package OOPS.Inheritance;

/*
 * If a class is derived by using one base class and that class is 
  derived from another base class is called multi level inheritance.
 */
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
class C extends B 
{
	public void m3()
	{
		System.out.println("M3-Method");
	}
}
public class MultiLevel2 
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
		c.m2();
		c.m3();
		
	}

}