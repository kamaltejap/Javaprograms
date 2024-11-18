import java.util.Scanner;

public class EvenSum {
    public static void main(String args[]){

        sum();
    
    }
    public static void sum(){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int j=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(j%2==0){
                sum=sum+j;//sum= sum +(2*i);
                System.out.print(j+" ");
                j++;
            }
            j++;
        }
        System.out.println();
        System.out.println("Sum :"+sum);
 }   
}
