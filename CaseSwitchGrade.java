import java.util.Scanner;

public class CaseSwitchGrade {
    public static void main(String args[]){
        System.out.print("Enter Max Marks :");
        Scanner t= new Scanner(System.in);
        int max=t.nextInt();
        System.out.print("Enter Marks :");
        int mark=t.nextInt();
        int per=mark*100/max;
        float grd=(float)(per/9.5);
        System.out.println("percentag :"+ per);
        System.out.println("Grade :"+ grd);
        switch(per){
            case 90 :
        }
    }
    
}
