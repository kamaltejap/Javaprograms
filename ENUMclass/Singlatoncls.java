package ENUMclass;

/*Singleton is one of the design pattern which allows us to create only one object for a class.
Using a class name if we call any method and that method returns same class object is called singleton class.
ex:
	Calendar c = Calendar.getInstance();
	LocalDate date = LocalDate.now();
	LocalTime time = LocalTime.now();
To create a singleton class we required private constructor and static method.
 */
class Singleton 
{
	static Singleton singleton=null;
	
	private Singleton()
	{
	}
	
	public static Singleton getInstance()
	{
		if(singleton==null)
		{
			singleton=new Singleton();
		}
		
		return singleton;
	}
}
public class Singlatoncls
 {
	public static void main(String[] args)
	{
		Singleton s1=Singleton.getInstance();
		System.out.println(s1.hashCode());
		
		Singleton s2=Singleton.getInstance();
		System.out.println(s2.hashCode());
		
		Singleton s3=Singleton.getInstance();
		System.out.println(s3.hashCode());
	}
}

    

