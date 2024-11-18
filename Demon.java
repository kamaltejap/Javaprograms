class Demon
{
  static int a=10;
  public static void display()
  {
    System.out.println("Static Method");
  }
  
  static
  {
   System.out.println("Static Block");
  }
 
   public static void main(String[] args)
   {
    System.out.println("Main Method");
    System.out.println(a);
    display();
   }
 }

