package Exeption;

public class CATCHblock {
    public static void main(String args[]){
    try
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException |IllegalArgumentException| ClassCastException  e)
		{
			e.printStackTrace();
		}

    }
}
