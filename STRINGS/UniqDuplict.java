package STRINGS;

public class UniqDuplict {
    public static void main(String[] args){
        String str="googleggg";

        String unique="";
        String duplicate="";

        for(int i=0;i<str.length();i++){
            String s=Character.toString(str.charAt(i));
           if(unique.contains(s)){
                if(!duplicate.contains(s)){
                    duplicate += s;
                    continue;
                }
           }
           else
           unique=unique+s;

        }
        System.out.println("unique ele : "+unique+"\nduplicate ele : " +duplicate);
    }
    
}
