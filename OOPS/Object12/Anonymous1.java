package OOPS.Object12;

// A Object with no referance id called Anonymous
class A
{
    A(){
        System.out.println("Object created");
    }
    public void m1(){
        System.out.println("method m1");
    }
}
public class Anonymous1 {
    public static void main(String args[]){
        new A();
        new A();
        new A().m1();

    } 
}
