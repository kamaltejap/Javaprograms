import java.util.Scanner;

public class palindrome {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int rev=0;
        int n=num;
        while(num !=0){
            rev = rev*10 + num%10;//3 32
            num= num /10;
        }
        if(n==rev){
            System.out.println(n +" is Pilindrome");
        }
        else{
            System.out.println("not");
        }
        sc.close();
    }
    
} 
