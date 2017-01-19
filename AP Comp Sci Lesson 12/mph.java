import static java.lang.Math.*;

public class mph
{
	private int d, h, m;
	private double mp;
	
	public mph()
	{
		d=0;
		h=0;
		m=0;
		mp=0;
	}
	
	public mph(int dist,int hour,int min)
	{
		d=dist;
		h=hour;
		m=min;
		mp=0;
	}
	
	public void mod(int dist,int hour,int min)
	{
		d=dist;
		h=hour;
		m=min;
	}
	
	public int getDist()
	{
		return d;
	}
	
	public int getHour()
	{
		return h;
	}
	
	public double getMph()
	{
		return mp=Math.round(d / (h + m / 60.0));
	}
	
}