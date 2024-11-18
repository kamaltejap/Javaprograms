import java.util.Scanner;
public class CaseSwit
{
    public static void main(String[] args)
    {
        Scanner h=new Scanner(System.in);
        int n=h.nextInt();
        //Caller Method
         day(n);
    }
    public static void day(int n){

        switch (n) {
            case 1:
            System.out.println("Monday");
                break;
            case 2:
            System.out.println("Tuesday");
                break;
            case 3:
            System.out.println("Wednesday");
                break;
                
            case 4:
            System.out.println("Thursday");
                break;
            case 5:
            System.out.println("friday");
                break;
            case 6:
            System.out.println("saturday");
                break;
            case 7:
            System.out.println("Sunday");
                break;
            
            default:
            System.out.println("Enter a valid number");
                
        }
    }
}
