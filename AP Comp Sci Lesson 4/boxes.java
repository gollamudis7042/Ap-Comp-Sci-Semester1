import java.util.Scanner;

public class boxes
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		boxes vol = new boxes();
		
		System.out.println("please enter the height in inches");
		double h = kb.nextDouble();
		
		System.out.println("please enter the width in inches");
		double w = kb.nextDouble();
		
		System.out.println("please enter the length in inches");
		double l = kb.nextDouble();
		
		double v = vol.volume(h,w,l);
		
		vol.format("Height in inches: ",h);
		vol.format("Width in inches: ",w);
		vol.format("Length in inches: ",l);
		vol.format("Volume in cubic feet: ",v);
		
	}
	public double volume(double h, double w, double l)
	{
		double v = (h/12)*(w/12)*(l/12);
		return(v);
	}
	public void format(String stuff, double num)
	{
		System.out.printf("\n  %25s %5.5f" , stuff, num);
	}
}