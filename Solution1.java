import java.util.Scanner;

class Solutio1{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.print(a+" ");
            for(int j=0;j<n-1;j++)
            {
                int c = (int) Math.pow(2,j);
                int d = c*b;
                int res = a+d;
                a=res;
                
                System.out.print(res+" ");
               // res= res +d ;
               // System.out.print((res )+" ");    
            }
        
        in.close();
    }
}