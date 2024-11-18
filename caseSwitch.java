import java.util.Scanner;
public class caseSwitch {
    public static void main(String args[]){

        marks();
        marks();
        marks();

    }
    public static void marks(){
        Scanner h=new Scanner(System.in);
        System.out.println("enter the marks");
        int x=h.nextInt();
        int a=(x>=35)?( (x>=80)?1 : ((x>=60)?2:3) ):4;
        
        switch(a){
            case 1:System.out.println("Exellent");break;
            case 2:System.out.println("Good");break;
            case 3:System.out.println("Average");break;
            case 4:System.out.println("Fail");break; 
        }
    
    }
}