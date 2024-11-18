package FileIOpackage;

import java.io.IOException;

public class PrintWriter {
 /* methods
    ----------
write(int ch)
write(char[] ch)
write(String s)
flush()
close()

writeln(int i)
writeln(float f)
writeln(double d)
writeln(String s)
writeln(char c)
writeln(boolean b)

write(int i)
write(float f)
write(double d)
write(String s)
write(char c)
write(boolean b)
*/
    public static void main(String[] args)throws IOException
	{
		PrintWriter pw=new PrintWriter("abc.txt");

		pw.write(100);// d
		pw.println(100);// 100
		pw.print('a');
		pw.println(true);
		pw.println("hi");
		pw.println(10.5d);

		pw.flush();
		pw.close();
		System.out.println("Please check the location");
	}

}
