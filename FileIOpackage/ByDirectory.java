package FileIOpackage;
import java.io.*;

public class ByDirectory {
    public static void main(String[] args)throws IOException 
	{
		File f=new File("bhaskar123");
		System.out.println(f.exists());//false
        
        //A File object can be used to create a directory also.
		f.mkdir();//make dirctory
		System.out.println(f.exists());//true 

	}

}
