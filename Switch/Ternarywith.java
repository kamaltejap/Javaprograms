package Switch;
import java.util.*;
public class Ternarywith {
    public static void main(String args[]){
        Scanner h=new Scanner(System.in);
        System.out.println("enter the marks");
        int x=h.nextInt();
        int a=(x>=35)?((x>=80)?1:2):3;
         
        switch(a){
            case 1:System.out.println("Exellent");break;
            case 2:System.out.println("Average");break;
            case 3:System.out.println("fail");break; 
        }
    }
}
