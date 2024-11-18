package STRINGS;

public class EqualtoDiffer {
    public static void main(String args []){
        
        String s1="ihub";
        String s2="ihub";

        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true
        
        String obj1=new String("ihub");
        String obj2=new String("ihub");

        System.out.println(obj1==obj2);//false  - checks the address

        System.out.println(s1.equals(obj1));//true  -checks the content

        System.out.println(s1==obj1);//false

        //.intern()
        String s3=obj1.intern();

        System.out.println(s3==s1);//true
        System.out.println(s3==s2);//true

       
    }
    
}
