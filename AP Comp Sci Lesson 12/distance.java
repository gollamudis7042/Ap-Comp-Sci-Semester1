import java.lang.Math.*;

public class distance
{
	private int x1, y1, x2, y2;
	private double d;
	
	public distance()
	{
		d=0;
		x1=0;
		x2=0;
		y1=0;
		y2=0;
	}
	
	public distance(int x,int y,int xx,int yy)
	{
		d=0;
		x1=x;
		x2=xx;
		y1=y;
		y2=yy;
	}
	
	public void mod(int x,int y,int xx,int yy)
	{
		x1=x;
		x2=xx;
		y1=y;
		y2=yy;
	}
	
	public double getDist()
	{
		return d=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
}