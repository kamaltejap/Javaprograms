package ENUMclass;

public class WrapperUtility {
	public static void main(String[] args)
	{
        /*1) parseXxx()
It is used to convert string to primitive type */
		String str="10";
		
		int i= Integer.parseInt(str);
		System.out.println(i); // 10 
		
		long l= Long.parseLong(str);
		System.out.println(l); // 10 
		
		float f= Float.parseFloat(str);
		System.out.println(f); // 10.0
		
		double d= Double.parseDouble(str);
		System.out.println(d); // 10.0

        /*2) toString() 
It is used to convert wrapper object to string.*/
        Integer i1=new Integer(10);
                
        String st =i1.toString();

        System.out.println(st); // 10
        /*  3) xxxValue()
It is used to convert wrapper object to primitive type. */
        Integer i4=new Integer(10);
                
        byte b = i4.byteValue();
        System.out.println(b); 

        short s = i4.shortValue();
        System.out.println(s); 


}
}


