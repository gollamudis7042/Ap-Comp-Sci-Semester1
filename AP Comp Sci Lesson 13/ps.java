public class ps extends console
{
	public ps()
	{
		super();
	}
	
	public ps(String p)
	{
		super(p);
	}
	
	public int getS()
	{
		return super.getS();
	}
	
	public String getControl()
	{
		return "ps dualshock 3";
	}
	
	public String getP()
	{
		return "ps";
	}
	
	public String toString()
	{
		return getP() + " " + getS() + " " + getControl();
	}
}