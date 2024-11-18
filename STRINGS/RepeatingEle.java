package STRINGS;

public class RepeatingEle {
    public static void main(String args[]){
        String str="ihubtalentinstitute";

        char ch='a';
        int maxcnt=0;

        for(int i=0;i<str.length();i++){
            int cnt=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    cnt++;
                }
            }
            if(maxcnt<cnt){
                maxcnt=cnt;
                ch=str.charAt(i);
            }
        }
        System.out.println(ch+" repeating "+maxcnt+" times");
    }
    
}
