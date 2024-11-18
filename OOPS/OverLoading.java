package OOPS;
/*Having same method name with different parameters/signatures in a single class is called method overloading.
All the methods present in a class are called overloaded methods.
Method overloading will reduce complexity of the programming.
Method resolution will taken care by a compiler based on reference type.
 */
class MeeSeva
{
	//overloaded methods
	public void search(int voterId)
	{
		System.out.println("Details Found via voterId");
	}
	public void search(String houseNo)
	{
		System.out.println("Details Found via houseNo");
	}
	public void search(long aadharNo)
	{
		System.out.println("Details Found via aadharNo");
	}
}
public class OverLoading 
{
	public static void main(String[] args)
	{
		MeeSeva ms=new MeeSeva();
		ms.search(101);
		ms.search("1-4-6/3");
		ms.search(1234L);
	}



    
}
