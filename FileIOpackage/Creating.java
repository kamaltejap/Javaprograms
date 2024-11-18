package FileIOpackage;
import java.io.*;

public class Creating {
    public static void main(String[] args)throws IOException 
	{
		File f=new File("abc.txt");
		System.out.println(f.exists());//false

     // A File object can be used to create a physical file.
		f.createNewFile();
		System.out.println(f.exists());//true

	}

    
}
