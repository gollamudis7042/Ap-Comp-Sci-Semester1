public class car
{
	private String p, i, e, t;
	
	public car(String pp, String ii, String ee, String tt)
	{
		p=pp;
		i=ii;
		e=ee;
		t=tt;
	}
	
	public void mod(String pp, String ii, String ee, String tt)
	{
		p=pp;
		i=ii;
		e=ee;
		t=tt;
	}
	
	public String gP()
	{
		return p;
	}
	
	public String gI()
	{
		return i;
	}
	
	public String gE()
	{
		return e;
	}
	
	public String gT()
	{
		return t;
	}
}