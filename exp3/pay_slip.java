import java.io.*;
import java.util.*;

class employee
{
	public void input()
	{	
		String emp_name;
		long emp_id;
		String address;
		long mobile;
		String mail;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter employee's name");
		emp_name = sc.nextLine();
		System.out.println("\nEnter employee's address");
		address = sc.nextLine();
		System.out.println("\nEnter employee's mail id");
		mail = sc.next();
		System.out.println("\nEnter employee's id");
		emp_id = sc.nextLong();	
		System.out.println("\nEnter employee's mobile");
		mobile = sc.nextLong();
	}
};

class programmer extends employee
{
	
	public void get()
	{
		double da,hra,pf,scf,gross_pay,net_pay;
		System.out.println("\nPROGRAMMER");
		long basic_pay;
		Scanner sc = new Scanner (System.in);
		System.out.println("\nEnter basic pay");
		basic_pay = sc.nextLong();
		da = 0.97 * basic_pay;
		hra = 0.1 * basic_pay;
		pf = 0.12 * basic_pay;
		scf = 0.001 * basic_pay;
		gross_pay = basic_pay+da+hra+pf+scf;
		net_pay = basic_pay+da+hra;
		System.out.println("Gross pay is "+gross_pay+"\nNet pay is "+net_pay);
	}
};

class asso_prof extends employee
{
	
	public void get()
	{
		double da,hra,pf,scf,gross_pay,net_pay;
		System.out.println("\nASSOCIATE PROFESSOR");
		long basic_pay;
		Scanner sc = new Scanner (System.in);
		System.out.println("\nEnter basic pay");
		basic_pay = sc.nextLong();
		da = 0.97 * basic_pay;
		hra = 0.1 * basic_pay;
		pf = 0.12 * basic_pay;
		scf = 0.001 * basic_pay;
		gross_pay = basic_pay+da+hra+pf+scf;
		net_pay = basic_pay+da+hra;
		System.out.println("Gross pay is "+gross_pay+"\nNet pay is "+net_pay);
	}
};
class asst_prof extends employee
{
	
	public void get()
	{	
		double da,hra,pf,scf,gross_pay,net_pay;
		System.out.println("\nASSISTANT PROFESSOR");
		long basic_pay;
		Scanner sc = new Scanner (System.in);
		System.out.println("\nEnter basic pay");
		basic_pay = sc.nextLong();
		da = 0.97 * basic_pay;
		hra = 0.1 * basic_pay;
		pf = 0.12 * basic_pay;
		scf = 0.001 * basic_pay;
		gross_pay = basic_pay+da+hra+pf+scf;
		net_pay = basic_pay+da+hra;
		System.out.println("Gross pay is "+gross_pay+"\nNet pay is "+net_pay);
	}
};

class prof extends employee
{
	
	public void get()
	{	
		double da,hra,pf,scf,gross_pay,net_pay;
		System.out.println("\nPROFESSOR");
		long basic_pay;
		Scanner sc = new Scanner (System.in);
		System.out.println("\nEnter basic pay");
		basic_pay = sc.nextLong();
		da = 0.97 * basic_pay;
		hra = 0.1 * basic_pay;
		pf = 0.12 * basic_pay;
		scf = 0.001 * basic_pay;
		gross_pay = basic_pay+da+hra+pf+scf;
		net_pay = basic_pay+da+hra;
		System.out.println("Gross pay is "+gross_pay+"\nNet pay is "+net_pay);
	}
};

public class pay_slip
{
public static void main(String args[])
	{
		double n,i;
		int num;
		
		programmer p = new programmer();
		asso_prof a = new asso_prof();
		asst_prof s = new asst_prof();
		prof f = new prof();
		System.out.println("Enter the number of employees");
		Scanner sc = new Scanner (System.in);
		n = sc.nextDouble();
		for(i=0;i<n;i++)
		{	
			System.out.println("Enter 1, 2, 3 or 4 corresponding to programmer, associative prof. , asst. prof. or professor respectively");
			num = sc.nextInt();
			switch(num)
			{
				case 1:
					p.input();
					p.get();
					break;
				case 2:
					a.input();
					a.get();
					break;
				case 3:
					s.input();
					s.get();
					break;
				case 4:
					f.input();
					f.get();
					break;
			}
		}
	}
};
