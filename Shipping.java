import java.util.*;

public class Shipping {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter weight : ");
        int weight=sc.nextInt();
        System.out.println("Enter destination : ");
        String destin=sc.next();
        int price=0;
        if(destin.equals("domestic")){
            if(weight<=5){
                 price=500;
                 System.out.println("price= "+price);
            }
            if(weight>5){
                price=500+(weight-5)*100;
                System.out.println("price= "+price);
            }
        }
        else if(destin.equals("international")){
            if(weight<=5){
                price=1000;
                System.out.println("price= "+price);
            }
            else if(weight>5 && weight<=10){
                price=1000+(weight-5)*200;
                System.out.println("price= "+price);
            }
            else if(weight>10){
                price=1000+(weight-5)*200+500;
                System.out.println("price= "+price);
            }
        }
    }
}
