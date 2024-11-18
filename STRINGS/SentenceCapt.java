package STRINGS;

public class SentenceCapt {
    public static void main(String args[]){
        String str="This is Java class For students";

        String[] sarr=str.split(" ");
        for(String s:sarr){
         char[] carr=s.toCharArray();
         char c=carr[0];
         if(c>='A'&& c<='Z'){
            System.out.print(s+" ");
         }
        }
        

    
    }

    
}
