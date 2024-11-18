package Static;

public class StaticBloc{
    static int a=10;
    static void display()
    {
        System.out.println("Static Method");
    }
    static
    {
        System.out.println("Static Block");
    }
public class Test
    {
       public  void main(String[] agrs)
    {
        System.out.println("Main Method");
        System.out.println(StaticBloc.a);
        StaticBloc.display();
    }
   }
}   


