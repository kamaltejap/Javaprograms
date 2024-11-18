package STRINGS;

public class EncodeAlphabet {
    public static void main(String args[]){

        String s="1106";//1 1 10 6

      //char[] carr=s.toCharArray();

      for(int i=0;i<s.length();i++){

        int n=Character.getNumericValue(s.charAt(i));
        if(n>0){
            System.out.println((char)('A'+n-1));
        }
        else{
          int k=Integer.parseInt(s.substring(i-1,i+1));
          System.out.println((char)('A'+k-1));
        
        }
      }
          
    }  
}
