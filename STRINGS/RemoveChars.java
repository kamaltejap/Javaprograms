package STRINGS;

public class RemoveChars {

    public static void main(String[] args){
        String str="*a2rf@i%ut&Fs";

        str=str.replaceAll("[^A-Z0-9a-z]","");
        System.out.println(str);
    }
    
}
