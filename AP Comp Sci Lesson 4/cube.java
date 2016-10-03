import java.util.Scanner;

public class cube
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the side length");
		double side = kb.nextDouble();
		
		print(side);
	}
	public static double calcSurf(double side)
	{
		return (side*side*6);
	}
	public static void print(double side)
	{
		System.out.println("The surface area of a cube with side length " + side + " is " + calcSurf(side));
	}
}