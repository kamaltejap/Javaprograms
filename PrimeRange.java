import java.util.Scanner;

public class PrimeRange {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        if(a<b)
        {
            for(int i=a;i<=b;i++)
            {
                int cnt=0;
                for(int n=1;n<=b;n++)
                {
                    if(i%n==0){
                        cnt++;
                    }
             }
            if(cnt==2){
                System.out.print(i+" ");
            }
        }
        }
       else
        System.out.println("not defined");

    }  
    
}
