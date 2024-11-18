public class Constructor 
{ 
    String name;
    int num;
    static{
      System.out.println("m1");
    }
    
    Constructor()
    {
      name ="ABC";
      num = 10;
      System.out.println("default,not call");
    }
    
     public static void main(String[] args)
     {
        Constructor t1 = new Constructor();
      
        System.out.println(t1.name+":"+ t1.num);
     }
}

    //parameterized constrctor
//     string name;
//     int num;
//   Constructor(String str,int n)
//   {
//       name =str;
//       num = n;
//      System.out.println("default, not call");
//    }
//     public static void main(String[] args)
//     {
//       Constructor t1 = new Constructor("DEF", 12); 

//       System.out.println(t1.name +":"+ t1.num);
//     }
