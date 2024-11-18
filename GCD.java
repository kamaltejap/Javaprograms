import java.util.Scanner;

public class GCD {
    // Function to return the GCD of two numbers
    // public static int findGCD(int a, int b) {
    //     if (b == 0) {
    //         return a;
    //     }
    //     return findGCD(b, a % b);
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculating GCD
        //int gcd = findGCD(num1, num2);

        // Displaying the result
       // System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        int g=(num1>num2)?num1:num2;
        int s=(num1<num2)?num1:num2;
        int t;
        do{
            t=g%s;
            if(t==0){
                System.out.println(s +" is GCD");
            }
            else{
                System.out.println(t +" is GCD");
            }
            
        }while(t==0);
         
        scanner.close();
    }
}
