import java.util.Scanner;

public class circle
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the radius");
		double r = kb.nextDouble();
		
		print(r);
	}
	public static double calcArea(double r)
	{
		return (3.14*r*r);
	}
	public static void print(double r)
	{
		System.out.println("The area of a circle with a radius of " + r + " is " + calcArea(r));
	}
}