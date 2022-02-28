class my_exception extends Exception
{
	String str1;
	my_exception(String str2)
	{
		str1=str2;
	}
	public String toString()
	{
		return ("My exception occured. "+str1);
	}
}

public class Example1
{
	public static void main(String[]args)
	{
		try
		{
			throw new my_exception("This is my error message");
		}
		catch(my_exception exp)
		{
			System.out.println(exp);
		}
	}
}