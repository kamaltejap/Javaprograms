package ENUMclass;
/*
 * The main objective of wrapper classes are.
1) To wrap primitive type to wrapper object and vice versa.
2) To define several utility method.
 */
public class Wrappercls {
    public static void main(String[] args)
	{
		Integer i1=new Integer(10);
		System.out.println(i1); //10
		
		Integer i2=new Integer("20");
		System.out.println(i2); //20

        Boolean b1=new Boolean(true);
		System.out.println(b1);

        Character c=new Character('a');
		System.out.println(c);//a
	}

}
