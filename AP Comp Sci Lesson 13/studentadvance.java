public class studentadvance extends advance
{
	public int getSerial()
	{
		return super.getSerial();
	}
	
	public void setD(int n)
	{
		super.setD(n);
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return super.toString()+" "+ "id: 234234";
	}
}