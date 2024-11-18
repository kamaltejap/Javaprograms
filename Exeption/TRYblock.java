package Exeption;

public class TRYblock {
    public static void main(String args []){

        try
        {
            System.out.println(10/0);
        }
        //A try block contains multiple catch blocks but order of catch blocks it should be child to parent

        catch(ArithmeticException Ae)
        {
           System.out.println("From AE"); 
        }
        catch(RuntimeException Re)
        {
           System.out.println("From RE"); 
        }
        catch(Exception e)
        {
           System.out.println("From E"); 
        }
        

    }
    
}
