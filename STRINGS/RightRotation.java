package STRINGS;

public class RightRotation { 
    public static void main(String args[]){
    String str="ihubtalent";
    int cnt=4;

//     String word1=str.substring(0,cnt);
//     String word2=str.substring(cnt,str.length()); 

        char[ ] carr=str.toCharArray();

            String word1="";
            String word2=""; 
            for(int i=0;i<cnt;i++){ 
                word1  +=carr[i];
            }
            for(int i=cnt;i<carr.length;i++){
                word2 +=carr[i];
            }
            String word=word2+word1;
            System.out.println(word);

    }
    
}
