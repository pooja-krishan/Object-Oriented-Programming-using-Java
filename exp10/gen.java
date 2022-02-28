import java.io.*;
import java.util.*;
import java.lang.*;
public class gen
{
	public <T extends Comparable <T>> void max(T a, T b)
	{
		//System.out.println(a);
		//`System.out.println(b);

		if(a.compareTo(b)>0)
		{
			System.out.println(a +" is maximum");
		}
		else
		{
			System.out.println(b +" is maximum");
		}
	}
	public static void main(String args[])
	{
		gen obj= new gen();
		obj.max(5,4);
		obj.max(2.5,5.2);
		obj.max('p','z');
		obj.max("apz","aaa");
	}
}