package Interface;
//coverting into abstract class
abstract class Computer{     //interface Computer
    public abstract void code();
}
class Desktop extends Computer{//implements
    public void code(){
        System.out.println("code,compile,runn,Faster");
    }
}
class Laptop extends Computer{//implements
    public void code(){
        System.out.println("code,compile,run..");
    }
}
class Developer{
    public void devApp(Computer obj1){
        obj1.code();
    }
}
public class NeedInterface2 {
    public static void main(String args[]){

        Computer lap =new Laptop();
        Computer desk=new Desktop();

        Developer obj= new Developer();
        obj.devApp(desk);// now which one want gives that object here
        

    }
    
}
