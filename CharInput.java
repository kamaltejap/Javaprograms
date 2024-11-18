import java.util.Scanner;
public class CharInput {

    public static void main(String[] args)
    {
        value();
        value();

    }
    public static void value()
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        if(ch>=65 && ch<=90){
        System.out.println("Uppercase");   
        }
        else if(ch>='a' && ch<='z'){//(a,z)
            System.out.println("Lowercase");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Symbol");
        }

    }
    
}
