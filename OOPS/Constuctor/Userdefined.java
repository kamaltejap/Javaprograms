package OOPS.Constuctor;

import Static.StaticBloc.Test;

public class Userdefined 
{
   public Userdefined()
	{
		System.out.println("0-arg const");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main-method");	
		Userdefined t=new Userdefined();
        Userdefined t1=new Userdefined();
	}
 
}
