public class human
{
	private String h, e, s;
	
	public human()
	{
		h="";
		e="";
		s="";
	}
	
	public human(String hh, String ee, String ss)
	{
		h=hh;
		e=ee;
		s=ss;
	}
	
	public void mod(String hh, String ee, String ss)
	{
		h=hh;
		e=ee;
		s=ss;
	}
	
	public String gH()
	{
		return h;
	}
	
	public String gE()
	{
		return e;
	}
	
	public String gS()
	{
		return s;
	}
}