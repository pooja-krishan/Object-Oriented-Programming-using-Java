import java.io.*;
import java.util.*;
import java.lang.*;
class stacks implements Stack
{
	Scanner sc = new Scanner(System.in);
	int index=1;
	int n=0;
	int [] arr = new int[5];
	public void push()
	{
		System.out.println("Enter an element");
		arr[index-1]=sc.nextInt();
		index++;
		n++;
		if(n>5)
		{
			try
				{
					throw new ArrayIndexOutOfBoundsException();
				}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public void pop()
	{
		n=n-1;
		if(n>5)
		{
			try
				{
					throw new ArrayIndexOutOfBoundsException();
				}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public void display()
	{
		System.out.println("Stack:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		if(n>5)
		{
			try
				{
					throw new ArrayIndexOutOfBoundsException();
				}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class adt
{
	public static void main(String args[])
	{
		int c;
		char ch;
		Scanner s = new Scanner(System.in);
		stacks o = new stacks();
		do{
		System.out.println("Enter 1, 2 or 3 corresponding to if you want to push, pop or display");
		c=s.nextInt();
		switch(c)
		{
			case 1:
				o.push();
				break;
			case 2:
				o.pop();
				break;
			case 3:
				o.display();
				break;
			default:
				System.out.println("Enter a number from 1 to 3.");
				break;
		}
		System.out.println("Enter Y or y to continue");
		ch=s.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		s.close();
	}
}