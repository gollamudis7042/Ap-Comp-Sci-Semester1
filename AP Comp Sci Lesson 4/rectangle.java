import java.util.Scanner;

public class rectangle
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length and width");
		double length = kb.nextDouble();
		double width  = kb.nextDouble();
		
		print(length,width);
		
	}
	public static double calcPerim(double length, double width)
	{
		double perimeter  = (2*length)+(2*width);
		return perimeter;
	}
	public static void print(double length, double width)
	{
		System.out.println("Your rectangle is " + calcPerim(length, width) + " ft around");
	}
}
