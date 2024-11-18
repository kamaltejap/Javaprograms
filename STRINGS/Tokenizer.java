package STRINGS;
import java.util.StringTokenizer;
public class Tokenizer {
    public static void main(String args[]){

        //StringTokenizer st=new StringTonizer(String,RegularExpression regex);
        StringTokenizer st=new StringTokenizer("This,is,java,class",",");

        //it has 5 methods

        System.out.println(st.countTokens());//4 - public int countTokens()

        while(st.hasMoreTokens()){//boolean 

            String s1=st.nextToken();//direct gives the String
            System.out.print(s1+" ");
        }

        /*if two while loops are there,then only one will be execute */

        while(st.hasMoreElements()){

            //st.nextTElement()- gives the object
            String s2=(String)st.nextElement();//Object
            System.out.println(s2);

        }
    }
}
