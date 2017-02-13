public class xbox extends console 
{
	public xbox()
	{
		super();
	}
	
	public xbox(String p)
	{
		super(p);
	}
	
	public int getS()
	{
		return super.getS();
	}
	
	public String getControl()
	{
		return "xbox wireless controller";
	}
	
	public String getP()
	{
		return "xbox";
	}
	
	public String toString()
	{
		return getP() + " " + getS() + " " + getControl();
	}
}