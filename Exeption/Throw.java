package Exeption;

public class Throw {
    public static void main(String[] args) 
	{	
        //Here exception object is created and handover to JVM by main method.
        System.out.println(10/0);

        //Here exception object is created explicitly and handover to JVM manually by using throw statement.
		throw new ArithmeticException("Don't divide by zerooooo");	
	}

}
