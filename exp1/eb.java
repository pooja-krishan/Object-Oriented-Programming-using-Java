import java.io.*;
import java.util.*;
class eb
{
	public static void main(String args[])
	{
		long cons_num;
		double unit,curr,last,amt=0;
		String name,type;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("\nEnter your consumer number");
		cons_num=sc.nextLong();
		System.out.println("\nEnter old unit");
		last=sc.nextDouble();
		System.out.println("\nEnter current units");
		curr=sc.nextLong();
		unit=curr-last;
		System.out.println("\nEnter the type as domestic or commercial consumption");
		type=sc.next();
		System.out.println("\n"+type);
		System.out.println("\n"+unit);
	
	
		if(type.compareTo("domestic")==0)
		{
			if(unit<100)
			{
				amt=unit;
			}
			else if(unit<=200)
			{
				amt=100+(unit-100)*2.5;
			}
			else if(unit<=500)
			{
				amt=100+(100*2.5)+(unit-200)*4;
			}
			else if(unit>500)
			{
				amt=100+(100*2.5)+(300*4)+(unit-500)*6;
			}
		}
		if(type.compareTo("commercial")==0)
		{
			if(unit<100)
			{
				amt=unit*2;
			}
			else if(unit<=200)
			{
				amt=200+(unit-100)*4.5;
			}
			else if(unit<=500)
			{
				amt=200+(100*4.5)+(unit-200)*6;
			}
			else if(unit>500)
			{
				amt=200+(100*2.5)+(300*6)+(unit-500)*7;
			}
		}
		System.out.println("\nBilled amt is " +amt);
		
	}
}

