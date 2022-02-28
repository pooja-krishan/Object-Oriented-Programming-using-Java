import java.util.*;
class my_exception extends Exception
{
	String str1;
	my_exception(String str2)
	{
		str1=str2;
	}
	public String toString()
	{
		return ("Welcome! "+str1);
	}
}

public class Voting_Rights
{
	public static void main(String[]args)
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age=sc.nextInt();
		if(age<18)
		{
			try
			{
				throw new my_exception("Oops! Sorry. You do not have the right to vote");
			}
			catch(my_exception exp)
			{
				System.out.println(exp);
			}
		}
		else
		{
			try
			{
				throw new my_exception("You have the right to vote");
			}
			catch(my_exception exp)
			{
				System.out.println(exp);
			}
		}
	}
}