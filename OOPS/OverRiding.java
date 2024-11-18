package OOPS;

/*Having same method name with same parameters into two different classes is called method overriding.
Methods which are present in parent class are called overridden methods.
Methods which are present in child class are called overridding methods.
Method resolution will taken care by JVM based on runtime object.
***If we declare any method as final then overridding of that method is not possible.
*/
class Parent 
{
	public void property()
	{
		System.out.println("Cash+Gold+Land+House");
	}
	public void marry()
	{
		System.out.println("Trisha");
	}
    //overridden methods 
	private void house()
	{
		System.out.println("father House");
	}

}
class Child extends Parent 
{
	public void marry()
	{
		System.out.println("Rashmika");
	}
    public void house()//it can't override bacause it's private
	{
		System.out.println("child House");
	}

}
public class OverRiding {
	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.property(); // Cash+Gold+land+House
		p.marry(); // Trisha 
		//p.house C.T.E

		Child c=new Child();
		c.property(); // Cash+Gold+Land+House
		c.marry(); // Rashmika
		c.house();//childe House
		Parent p1=new Child();
		p1.property(); // Cash+Gold+Land+House
		p1.marry(); // Rashmika
	
        c.house();//childe House
        
	}



    
}
