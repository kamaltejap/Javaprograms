package OOPS.Encapsulation;

class Human{
    private int age;
    private String name;  
    //without using 'this' keyword
    public void setage(int age,Human obj){
        Human obj1=obj;
    }
    public int getage(){
        return age;
    }
}
public class ByObject {
    public static void main(String args[]){
        Human obj=new Human();
        obj.setage(3,obj);
    }
}
