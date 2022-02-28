import java.io.*;
import java.util.*;

class thread1 implements Runnable
{
	int n;
	thread1(int num)
	{
		n=num;
	}
	public void run()
	{
		System.out.println(n);
	}
}
class thread2 implements Runnable
{
	int n,sqr;
	thread2(int num)
	{
		n=num;
	}
	public void run()
	{
			//System.out.println(n);
			sqr=n*n;
			System.out.println("Square of "+n+" is "+sqr);
		}
	
}
class thread3 implements Runnable
{
	int cube,n;
	thread3(int num)
	{
		n=num;
	}
	public void run()
	{

			
			//System.out.println(n);
			cube=n*n*n;
			System.out.println("Cube of "+n+" is "+cube);
	}
}

public class multithreads                                                                                                                        
{	
	public static void main(String args[]) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int num, n,i;
		i=0;
		System.out.println("Enter the number of random numbers to be generated");
		n=sc.nextInt();
		Random rand = new Random();
		for(i=0;i<n;i++)
		{
			num=rand.nextInt(100);
			Thread.sleep(1000);
			thread1 r1= new thread1(num);
			Thread t1 = new Thread(r1);
			t1.start();
			if(num%2==0)
			{
				thread2 r2=new thread2(num);	
				Thread t2 = new Thread(r2);
				t2.start();
			}
			else
			{
				thread3 r3=new thread3(num);
				Thread t3 = new Thread(r3);
				t3.start();
			}
		}
	}
}