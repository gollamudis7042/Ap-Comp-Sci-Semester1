import java.util.Scanner;
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
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		mph object = new mph(kb.nextInt(),kb.nextInt(),kb.nextInt());
		
		System.out.println(object.getDist()+ " miles in " + object.getHour() + " hours = " + object.getMph() + " mph");
		
		object.mod(5,4,3);
		
		System.out.println(object.getDist()+ " miles in " + object.getHour() + " hours = " + object.getMph() + " mph");
	}
}