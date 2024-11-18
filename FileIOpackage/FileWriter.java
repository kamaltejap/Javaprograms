
import java .io.*;

public class FileWriter {

    public static void main(String[] args)throws IOException
        {
            FileWriter fw=new FileWriter("abc.txt");

            //write(int ch)It will insert single character into a file.
            fw.write(98);// b 
            fw.write("\n");

            //write(char[] ch)It will insert single character into a file.
            char[] ch={'a','b','c'};
            fw.write(ch);
            fw.write('\n');
            
            //write(String s)It will insert String into a file
            fw.write("bhaskar\nsolution");

            //flush()It gives guaranttee that last character of a file is also inserted
            fw.flush();

            //lose()It is used to close the FileWriter objec
            fw.close();
            System.out.println("Please check the location");
        }

}
