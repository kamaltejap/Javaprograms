package STRINGS;

public class RemoveSpaces {
    public static void main(String[] args){
        String s1="K a m   al";
        
      s1=s1.replaceAll("\\s","");
      System.out.println(s1);

      String st="   teja  ";
      String trim=st.trim();
      System.out.println(trim);
    }
}
