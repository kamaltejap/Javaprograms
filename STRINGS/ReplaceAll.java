package STRINGS;

public class ReplaceAll {
    public static void main(String[] args)
	{
		String str1="Ihub12";
		String str2="Talent18";

        String word1=str1.replaceAll("[^a-zA-Z]","");
        int num1=Integer.parseInt(str1.replaceAll("[^0-9]",""));
        
        String word2=str2.replaceAll("[^a-zA-Z]","");
        int num2=Integer.parseInt(str2.replaceAll("[^0-9]",""));      
      
        //str1.repalceAll("\\s"," "); It will remove the all spaces in str1
        int num=num1+num2;
        System.out.println(word1+word2+num);
    }
		

}
