package Exeption;

public class Throws {
	
	/*If any checked exception raised in our program we must and should handle
	 that exception by using try and catch block or by using throws statement.*/

    public static void main(String[] args) 
	{
		try
		{
			Thread.sleep(5000);
			System.out.println("Executed After 5 seconds");
		}
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
   
}
