import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        String res="";
        
        //for(int i=n-1;i>=0;i--){
        // res =res+str.charAt(i);
        //}
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            ch =str.charAt((n-1)-i);
            res =res + ch;
        }
        System.out.print(res);
       /*2. using character Array
        char a[]=str.toCharArray();
         int n= a.length();
         for(int i=n-1;i>=0;i--){
              res =res +a[i}
         }                  */
        
    }

    
}
