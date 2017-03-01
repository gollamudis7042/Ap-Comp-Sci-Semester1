public class gmc implements location 
{
	private double x,y;
	
	public gmc(double x1,double y1)
	{
		x=x1;
		y=y1;
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
		double[] l = new double[2];
		l[0]=x;
		l[1]=y;
		return l;
	}
}