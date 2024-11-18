package STRINGS;

public class ABBCCC {

    public static void main(String args []){
        String s="ABBCCCDDDD";
    

        StringBuffer sb=new StringBuffer();

        int cnt=1;
        for(int i=0;i<s.length();i++){

          
             if(i<s.length()-1&&s.charAt(i)==s.charAt(i+1)){    
                    cnt++;
                }
            else{
                sb.append(s.charAt(i)).append(cnt);       
                cnt=1;
            }
        }
          System.out.println(sb.toString());
    
    }
    
}
