
import java.util.Scanner;

public class PilindromeStr {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
         String str = sc.next();
         String s =str;
         String rev ="";
         int n = str.length();
         for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            ch = str.charAt((n-1)-i);
            rev =rev +ch;
         }
         if(s == rev){
            System.out.println("it's a polindrome");
         }
         else{
            System.out.println("not");
         }
         sc.close();
    }
}
