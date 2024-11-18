package Exeption;

public class FinallyBlock {
    public static void main(String args []){

        // NOTE :try and finally combination is also valid in java
        try
        {	
            //Not reccommanded to maintain Cleanup code
            //Risky Code 
            System.out.println(10/0);

        } 
        catch(Exception e)	
        {
            //Not reccommanded to maintain Cleanup code
            //Error Handling Code 
            e.printStackTrace();
        }
        finally
        {
            //Cleanup code 
            //Always Executed
            System.out.println("finally-block");	
        }
    }
}
