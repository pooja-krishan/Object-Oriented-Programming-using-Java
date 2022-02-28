import java.io.*;
import java.util.*;
public class FileOperation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s;
		long len;
		boolean r,w,e;
		System.out.println("Enter the name of the file");
		s=sc.next();
		File f = new File(s);
		System.out.println(f.exists()?"Exists":"Does not");
		// e=f.exists();
		// if(e==false)
		// {
		// 	System.out.println("Does not exist");
		// }
		// else
		// {
		// 	System.out.println("Exists");
		// }
		System.out.println(f.canRead()?"Can read":"Cannot read");
		// r=f.canRead();
		// if(r==false)
		// {
		// 	System.out.println("Cannot read");
		// }
		// else
		// {
		// 	System.out.println("Can read");
		// }
		System.out.println(f.canWrite()?"Can write":"Cannot write");
		// w=f.canWrite();
		// if(w==false)
		// {
		// 	System.out.println("Cannot write");
		// }
		// else
		// {
		// 	System.out.println("Can write");
		// }
		len=f.length();
		System.out.println("Length of the file is "+len);
	}	
}