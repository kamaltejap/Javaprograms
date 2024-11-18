import java.util.Scanner; 
public class Avearage2 {
    public static void main(String[] args){
         //Calller Method
        float k=avg();
        System.out.println(k);
        float j=avg();
        System.out.println(j);
    }
        //Callie Method
    public static float avg()
    {
        int t=6;
        int total=0;
        while(t>0)
        {
            Scanner sc=new Scanner(System.in);
            int a =sc.nextInt();

            total = total + a;
            t--;
        }

        float avg=(float)total/6;
        return avg;
    }
    
    
}
