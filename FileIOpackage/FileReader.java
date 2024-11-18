package FileIOpackage;
import java.io.*;
import java.io.IOException;

public class FileReader {
    /* constructor()
FileWriter fw=new FileWriter(String s);
FileWriter fw=new FileWriter(File f);

*/
    public static void main(String[] args)throws IOException
	{
		FileReader fr=new FileReader("aaa.txt");

        char[] carr=new char[255];

		//load the data from file to char array
		fr.read(carr);

        /*write(int ch)
	It will insert single character into a file */
		int i=fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
	}

}
