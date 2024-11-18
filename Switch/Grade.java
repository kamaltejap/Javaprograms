package Switch;
import java.util.*;
public class Grade {
    public static void main(String args[]){
       
         grade();
         grade();
    }
    public static void grade()
    {
        Scanner t= new Scanner(System.in);
        System.out.print("Enter Max Marks :");
        int max=t.nextInt();

        System.out.print("Enter Marks :");
        int mark=t.nextInt();
         
        if(max>=mark){

            int per=mark*100/max;
            float grd=(float)(per/9.5);

            System.out.println("percentag :"+ per);
            System.out.println("Grade :"+ grd);
        }
        else
            System.out.println("Enter valid numbers");
    }
}