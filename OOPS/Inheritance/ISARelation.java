package OOPS.Inheritance;


    /*
    Is-A relationship is also known as inheritance.
    Using extends keyword we can implements Is-A Relationship.
    The main objective of Is-A relationship is to provide reusability.
    ***Child calss can takes the '.classfile' of Parent class,but not .java file
    */
class Parent 
{
	public void methodOne()
	{
		System.out.println("Method One");
	}
}
class Child extends Parent 
{
	public void methodTwo()
	{
		System.out.println("Method Two");
	}
}
public class ISARelation {

	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.methodOne();
		
		Child c=new Child();
		c.methodOne();
		c.methodTwo();
		
		Parent p1=new Child();
		p1.methodOne();
		
		//Child c1=new Parent(); C.T.E
		
	}
}


