package Exeption;

public class MethodsToDisplay {
    public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
            //Name, Description and Line number of the Exception
			ae.printStackTrace();
			
			System.out.println("=======================");

            //Name and Description of the Exception #call in s.o.p only
			System.out.println(ae.toString());
			
			System.out.println("=======================");

			//Description of the Exception # call in  s.o.p only
			System.out.println(ae.getMessage());
		}
	}

}
