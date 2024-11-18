package OOPS;

class Account 
{
	private double balance=5000d;
}

public class DataHiding extends Account{
    /*
     *Data hiding is a process of hiding object data from the outsiders.
    Using private modifier we can implements data hiding concept.
    The main objective of data hiding is to provide security.
     */
    public static void main(String[] args)
	{
		Account acnt=new Account();
		System.out.println(acnt.balance);//Beacuase it's private
	}

}
