import Convertor.*;
import java.util.*;
public class convert
{
	public static void main(String args[])
	{
		Distance o = new Distance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1, 2 or 3 to for distance, currency and time conversion respectively.");
		int convert = sc.nextInt();
		switch(convert)
		{
			case 1:
			{
				System.out.println("Enter 1, 2 3 or 4 for meter-kilometer, kilometer-meter, mile-kilometer or kilometer-mile conversion respectively");
				int distance = sc.nextInt();
				System.out.println("Enter the number to convert");
				double number = sc.nextDouble();
				switch(distance)
				{
					case 1:
					{
						o.m_km(number);
						break;
					}
					case 2:
					{
						o.km_m(number);
						break;
					}
					case 3:
					{
						o.mile_km(number);
						break;
					}
					case 4:
					{
						o.km_mile(number);
						break;
					}
					default:
					{
						System.out.println("Enter a number from 1 to 4");
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("Enter 1, 2 3, 4, 5 or 6 for dollar-inr, inr-dollar, euro-inr, inr-euro, yen-inr, inr-yen conversion respectively");
				int currency = sc.nextInt();
				System.out.println("Enter the number to convert");
				double number = sc.nextDouble();
				switch(currency)
				{
					case 1:
					{
						o.doll_inr(number);
						break;
					}
					case 2:
					{
						o.inr_doll(number);
						break;
					}
					case 3:
					{
						o.euro_inr(number);
						break;
					}
					case 4:
					{
						o.inr_euro(number);
						break;
					}
					case 5:
					{
						o.yen_inr(number);
						break;
					}
					case 6: 
					{
						o.inr_yen(number);
						break;
					}
					default:
					{
						System.out.println("Enter a number from 1 to 6");
						break;
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("Enter 1, 2 3, 4, 5 or 6 for hour-minute, minute-hour, minute-second, second-minute, hour-second, second-hour conversion respectively");
				int time = sc.nextInt();
				System.out.println("Enter the number to convert");
				double number = sc.nextDouble();
				switch(time)
				{
					case 1:
					{
						o.h_m(number);
						break;
					}
					case 2:
					{
						o.m_h(number);
						break;
					}
					case 3:
					{
						o.m_s(number);
						break;
					}
					case 4:
					{
						o.s_m(number);
						break;
					}
					case 5:
					{
						o.h_s(number);
						break;
					}
					case 6: 
					{
						o.s_h(number);
						break;
					}
					default:
					{
						System.out.println("Enter a number from 1 to 6");
						break;
					}
				}
				break;
			}
			default:
			{
				System.out.println("Enter a number from 1 to 3.");
				break;
			}
		}
		sc.close();
		// o.m_km(1000);
		// o.km_m(1);
		// o.mile_km(8);
		// o.km_mile(8);
		// o.doll_inr(10);
		// o.inr_doll(150);
		// o.euro_inr(1000);
		// o.inr_euro(12345);
		// o.yen_inr(1000);
		// o.inr_yen(12345);
		// o.h_m(1);
		// o.m_h(60);
		// o.m_s(60);
		// o.s_m(60);
		// o.h_s(24);
		// o.s_h(3600);
	}
}