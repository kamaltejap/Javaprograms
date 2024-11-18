package OOPS.Object12;

public class PrintingOBJ {
    public static void main(String[] args) 
	{
		PrintingOBJ  t1=new PrintingOBJ ();
		PrintingOBJ t2=new PrintingOBJ();
		PrintingOBJ t3=new PrintingOBJ();
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		System.out.println(t1);//Test@Hexadecimal 
		System.out.println(t2.toString());
		System.out.println(t3.toString());
    }
}
