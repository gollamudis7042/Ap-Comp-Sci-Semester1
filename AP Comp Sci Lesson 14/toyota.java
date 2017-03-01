import java.util.ArrayList;
public class toyota implements location 
{
	private double x,y;
	
	public toyota(String s)
	{
		String[] so = s.split(", ");
		ArrayList<Integer> t = new ArrayList<Integer>();
		for(int i = 0; i < so.length; i++)
		{
			t.add(Integer.parseInt(so[i]));
		}
		x=t.get(0);
		y=t.get(1);
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