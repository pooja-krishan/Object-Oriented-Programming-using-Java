package Convertor;
public class Distance
{
	public void m_km(double metre)
	{
		double km;
		km=metre/1000;
		System.out.println(metre+" meters is "+km +" kilometers");
	}

	public void km_m(double kilometer)
	{
		double m;
		m=kilometer*1000;
		System.out.println(kilometer+" kilometers is "+m+" meters");
	}

	public void mile_km(double mile)
	{
		double kilometer;
		kilometer=1.6*mile; 
		System.out.println(mile+" miles is "+kilometer+" kilometers");
	}
	public void km_mile(double km)
	{
		double mile;
		mile=km/1.6;
		System.out.println(km+" kilometers is "+mile+" miles");
	}

	public void doll_inr(double doll)
	{
		double inr;
		inr=doll*68.77;
		System.out.println(doll+" dollars is "+inr+" rupees");
	}
	public void inr_doll(double inr)
	{
		double doll;
		doll=inr/68.77;
		System.out.println(inr+" rupees is "+doll+" dollars");
	}
	public void euro_inr(double euro)
	{
		double inr;
		inr=euro*80.62;
		System.out.println(euro+" euros is "+inr+" rupees");

	}

	public void inr_euro(double inr)
	{
		double euro;
		euro=inr/80.62;
		System.out.println(inr+" rupees is "+euro+" euros");
	}
	
	public void yen_inr(double yen)
	{
		double inr;
		inr=yen*0.62;
		System.out.println(yen+" yen is "+inr+" rupees");
	}

	public void inr_yen(double inr)
	{
		double yen;
		yen=inr/0.62;
		System.out.println(inr+" rupees is "+yen+" yen");
	}
	
	public void h_m(double h)
	{
		double m;
		m=h*60;
		System.out.println(m+" minutes is "+h+" hours");
	}
	
	public void m_h(double m)
	{
		double h;
		h=m/60;
		System.out.println(h+" hours is "+m+" minutes");
	}

	public void m_s(double m)
	{
		double s;
		s=m*60;
		System.out.println(s+" seconds is "+m+" minutes");
	}

	public void s_m(double s)
	{
		double m;
		m=s/60;
		System.out.println(m+" minutes is "+m+" seconds");
	}

	public void h_s(double h)
	{
		double s;
		s=h*3600;
		System.out.println(h+" hours is "+s+" seconds");
	}

	public void s_h(double s)
	{
		double h;
		h=s/3600;
		System.out.println(s+" seconds is "+h+" hours");
	}


};