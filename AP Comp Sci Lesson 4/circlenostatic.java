import java.util.Scanner;

public class circlenostatic
{
	static double r, a;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		circlenostatic circle = new circlenostatic();
		
		System.out.println("Please enter the radius");
		r = kb.nextDouble();
		
		circle.calcArea();
		circle.print();
	}
	public void calcArea()
	{
		a = (3.14*r*r);
	}
	public void print()
	{
		System.out.println("The area of a circle with a radius of " + r + " is " + a);
	}
}