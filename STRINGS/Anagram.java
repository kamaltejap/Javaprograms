package STRINGS;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String str1="silent";
        String str2="listen";

        char[] carr1=str1.toCharArray();
        char[] carr2=str2.toCharArray();

        Arrays.sort(carr1);
        Arrays.sort(carr2);
       
        boolean flag=true;
        for(int i=0;i<carr1.length&&i<carr2.length;i++){

            if(carr1[i]!=carr2[i]){
                flag=false;
                break;
            }
        }
        if(flag==true)
        System.out.println("It's a anagram");
        else
        System.out.println("NOt");


    }
    
}
