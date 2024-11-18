import java.util.*;

public class WhileSwitch {
    public static void main(String args[]){
        Scanner h= new Scanner(System.in);
        int n =h.nextInt();
        int rem=0;
        while(n>0){
             rem=n%10;
            switch(rem){
                case 0:System.out.print("zero ");break;
                case 1:System.out.print("one ");break;
                case 2:System.out.print("two ");break;
                case 3:System.out.print("three ");break;
                case 4:System.out.print("four ");break;
                case 5:System.out.print("five ");break;
                case 6:System.out.print("six ");break;
                case 7:System.out.print("seven ");break;
                case 8:System.out.print("eight ");break;
                case 9:System.out.print("nine ");break;
            }
            n=n/10;
        }
    }
    
}
