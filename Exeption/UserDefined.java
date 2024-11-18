package Exeption;
import java.util.Scanner;

class EligibleToVoteException extends RuntimeException 
{
	EligibleToVoteException(String msg)
	{
		super(msg);//Using super keyword to Description of the Exception
	}
}
class NotEligibleToVoteException extends RuntimeException 
{
	NotEligibleToVoteException(String msg)
	{
		super(msg);
	}
}

public class UserDefined {
    public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the age :");
		int age=sc.nextInt();
		
		if(age<18)
			throw new NotEligibleToVoteException("Not Eligible to vote");
		else
			throw new EligibleToVoteException("Eligible to vote");	

	}	
	
	
	

}
