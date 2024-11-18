package Static;

class StaticBLock
{
    static 
    {
        System.out.println("StaticBlock");
    }
    StaticBLock()
    {
        System.out.println("constructor");
    }
   public void method()
   {
    System.out.println("Method");
    }
    public static void main(String[] args)
        {
          StaticBLock t =new StaticBLock();
          t.method();
        
   
        }
 }