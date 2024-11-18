public class Pascal {
    public static void main(String[] args) 
	{
		//rows
		for(int i=1;i<=5;i++)
		{
			//space
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}

			int number=1;
			for(int k=1;k<=i;k++)
			{
				System.out.print(number+" ");
				
				number = (number * (i-k))/k;
			}
			//new line 
			System.out.println();
		}
	}

}
