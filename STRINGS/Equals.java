package STRINGS;

public class Equals {
    public static void main(String[] args){
        String str1="ihub";
        String str2="ihub";
        String str3="IHUB";
        if(str1.equals(str2))
           System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");
        
            //equalsIgnoreCase
        if(str1.equalsIgnoreCase(str3)){
            System.out.println("Same");
        }

    }
    
}
