package STRINGS;

public class XYZselection {
    public static void main(String args[]){
        String str="XYZ";

        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(i!=j)
                System.out.println(str.charAt(i)+" "+str.charAt(j));
            }
        }


    }  
}
