import java.util.*;


public class Average {
    public static void main(String[] args){
   
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         //Caller method  
         avg(a,b,c);
    }
        //Callie Method
    public static void avg(int a,int b,int c)
    {
        int d=a+b+c;
        float avg=(float)d/3;
        System.out.println(avg);
    }
    
}
    

