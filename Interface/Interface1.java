package Interface;
/*IF A asks B how to go hyderabad
B gives the directions only,(giving design)
A wants to do take a walk(concreate method)
here B is the Interface and A is the another class having concreate methods 

Interface is a collection of zero or more abstraction methods.
Abstract methods are incomplete methods because they ends with semicolon and does not have any body.
ex
	void m1();
It is not possible to create object for interfaces.
To write the implementation of abstract methods we will use implementation class.
It is possible to create object for implementation class because it contains method with body.
By default every abstract method is a public and abstract.
ex:
	public abstract void m1();
Interface contains only constants i.e public static final.
We can declare interface as follow.
syntax:
	interface  <interface_name>
	{
		- //abstract methods 
		- //constants 
	}
If we know service requirement specification then we need to use interface.*/

interface A 
{
	public abstract void show();
	public void display();
	abstract void see();
	void view();
}
class B implements A 
{
	public void show()
	{
		System.out.println("Show Method");
	}
	public void display()
	{
		System.out.println("Display Method");
	}
	public void see()
	{
		System.out.println("See Method");
	}
	public void view()
	{
		System.out.println("View Method");
	}
}

class Interface1 
{
	public static void main(String[] args) 
	{
		A a=new B();
		a.show();
		a.display();
		a.see();
		a.view();
		
	}
}

