package STRINGS;

public class A1B2C3 {
    public static void main(String args[]){
        String str="A1B2C3D4";

        for(int i=0;i<str.length();i++){

            if(Character.isAlphabetic(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
            else{
                int n=Character.getNumericValue(str.charAt(i));
                for(int k=1;k<n;k++){
                    System.out.print(str.charAt(i-1));
                }
            }
        }

    }
}
