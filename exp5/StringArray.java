import java.io.*;
import java.util.*;
class Display 
{
	
	public void disp(int n,String arr[])
	{
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+"\n");
		}
	}
}

class Add
{
	public void add_at_end(int n,String arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to add at the end");
		arr[n]=sc.next();	
	}
}
class Insert
{
	public void append(int n, String arr[])
	{
		int pos,i;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position [0-9] at which string should be inserted");
		pos=sc.nextInt();
		System.out.println("Enter the string");
		s=sc.next();
		for(i=(n-1);i>=pos;i--)
		{
			arr[i+1]=arr[i];
			if(i==pos)
			{
				arr[i]=s;
			}
		}
	}
}

class Find
{
	public void search(int n, String arr[])
	{
		int i,flag=1;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to search");
		str=sc.next();
		for(i=0;i<n;i++)
		{
			if((arr[i]).equals(str))
			{
				System.out.println("String is present and is in position "+i+ " assuming index starts from 0");
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==0)
			System.out.println("String is not present");
	}
}

class Compare
{
	public void cmp(int n, String arr[])
	{
		int i;
		String c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the character to check the strings that start with it");
		c=sc.next();
		for(i=0;i<n;i++)

		{
			if(arr[i].startsWith(c))
			{
				System.out.println(arr[i]);
			}
		}
	}
}
public class StringArray
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int n,c;
		char ch;
		String [] arr = new String [10];
		System.out.println("Enter the number of strings (Not exceeding 10 strings)");
		n=sc.nextInt();
		int i;
		if(n>10)
		{
			System.out.println("Please enter only 10 strings or less");
		}
		else
		{
			for(i=1;i<=n;i++)
			{
				System.out.println("Enter "+i+" string");
				arr[i-1]=sc.next();
			}
		}
		Add o = new Add();
		Display obj = new Display();
		Insert ob = new Insert();
		Find s = new Find();
		Compare object = new Compare();
		do{
		System.out.println("Enter the corresponding number to perform the following operation");
		System.out.println("1.Display");
		System.out.println("2.Append at end");
		System.out.println("3.Insert at given position");
		System.out.println("4.Search for the string");
		System.out.println("5.List all the strings which start with a given letter");
		c=sc.nextInt();
		switch(c)
		{
			case 1:
				obj.disp(n,arr);
				break;
			case 2:
				o.add_at_end(n,arr);
				n=n+1;
				break;
			case 3:
				ob.append(n,arr);
				n=n+1;
				break;
			case 4:
				s.search(n,arr);
				break;
			case 5:
				object.cmp(n,arr);
				break;
			default:
				System.out.println("Please enter a valid option");
				break;
		}
		System.out.println("Enter y or Y to continue");
		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}