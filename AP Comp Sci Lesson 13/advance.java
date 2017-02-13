public class advance extends ticket
{
	private int days;
	
	public int getSerial()
	{
		return super.getSerial();
	}
	
	public void setD(int n)
	{
		days=n;
	}
	
	public double getPrice()
	{
		if(days>=10)
			return 30.00;
		else
			return 40.00;
	}
	
	public String toString()
	{
		return super.toString();
	}
}