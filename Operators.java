
class Operators
{
	public static void main (String[] args)
	{
        int a=5,b=10,c=6;
		
		//Ternary Operator
		int g=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("greater is : "+g);

		//Logical Operator
		boolean b1=5>2&&10>3;
		boolean b2=5<3||10<3;
		System.out.println(b1);
		System.out.println(b2);

		//Bitwise 
		int c1 =a&b;
		int c2=a|b;
		int c3=~a;
		int c4=a^b;
		System.out.println("& -"+c1);
		System.out.println("| -"+c2);
		System.out.println("~ _"+c3);
		System.out.println("^-"+c4);

		//Relational
		System.out.println(10>20);
		System.out.println(10!=2);
		System.out.println(10<=5);



	}

}