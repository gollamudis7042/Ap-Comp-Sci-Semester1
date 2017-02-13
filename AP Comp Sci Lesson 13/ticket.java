public abstract class ticket
{
	public int getSerial()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return ""+getSerial()+" "+getPrice();
	}
}