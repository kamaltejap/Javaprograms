class Loopwhile
{
	public static void main(String[] args)
	{
      int i = 1; 
	  //int j = 0; does't works
	  while (i<=3)
	  {
		System.out.println("Hi" + i);
	        int j =0;
			while(j<=1)
			{
				System.out.println("Hello" + j);
				j++;
			}
		i++;
	  }
	  
	 System.out.println("Bye"  + i);
	//System.out.println( j ); j is invalid here
	}
}
