public class honda implements location 
{
	private double x,y;
	private double[] lo;
	
	public honda(double[] l)
	{
		lo = l;
		x=l[0];
		y=l[1];
	}
	public int getID()
	{
		return (int)(Math.random() * (1000000-100000)+1) + 100000;
	}
	public void move(double xx,double yy)
	{
		x+=xx;
		y+=yy;
	}
	public double[] getLoc()
	{
		return lo;
	}
}