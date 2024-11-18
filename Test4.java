class Test4
{
  static int i = 10;
  public static void main(String[] args)
  {
   	System.out.println(i); //by directly
        
      Test4 t1 = new Test4();  //by object reference
      Test4 t2 = new Test4(); 
      t1.i=20;
      System.out.println(t1.i);  //20
      System.out.println(t2.i);  //20
      System.out.println(Test4.i); //20  by class name
        t1.m1();
   }
      //static method
    public static void m1()
    {
        System.out.println("Static Method");

    }
}   
        
        


