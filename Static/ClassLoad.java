package Static;
 class Demo{

    static
    {
        System.out.println("in Static block");
    }
    Demo()
    {
        System.out.println("Constructor");
    }
public class ClassLoad{

    public static void main(String[] args){
        Demo obj= new Demo();
        //note:If we don't create an object then we get no output
        //static block also not execute 
        Class.forName("Demo");
    }
}
}
