public class pc extends gamesystem
{
	public pc()
	{
		super();
	}
	
	public pc(String p)
	{
		super(p);
	}
	
	public int getS()
	{
		return super.getS();
	}
	
	public String getP()
	{
		return "pc";
	}
	
	public String systemI()
	{
		return "keyboard and mouse";
	}
	
	public String toString()
	{
		return getP() + " " + getS() + " " + systemI();
	}
}