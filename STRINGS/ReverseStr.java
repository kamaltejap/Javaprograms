package STRINGS;

public class ReverseStr {
    public static void main(String args[]){

        String str="001";

        char[] carr=str.toCharArray();
        
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+carr[i];
        }
        // StringBuffer sb=new StringBuffer();
        // sb.append(str);
        // String rev=sb.reverse().toString();

        System.out.println(rev);
    }
    
}
