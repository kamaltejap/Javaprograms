package STRINGS;

public class SentanceRev {
    public static void main(String args[]){
        String str="This is java class";

        String[] sarr=str.split(" ");
     
        //reading reverse  for eaach loop
        for(String s :sarr){
            char[] carr=s.toCharArray();
        
            for(int j=carr.length-1;j>=0;j--){
                System.out.print(carr[j]);
            }
            //space
            System.out.print(" ");
            
        }
    }
}
