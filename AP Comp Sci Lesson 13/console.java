public abstract class console extends gamesystem
{	
	public console()
	{
		super();
	}
	
	public console(String p)
	{
		super(p);
	}
	
	public int getS()
	{
		return super.getS();
	}
	
	public String getP()
	{
		return super.getP();
	}
	
	public abstract String getControl();
	
	public String toString()
	{
		return getP() + getS() + getControl();
	}
}