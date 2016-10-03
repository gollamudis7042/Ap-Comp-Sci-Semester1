import java.util.Scanner;

public class avgnostatic
{
	static double num1, num2, num3, avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		avgnostatic average = new avgnostatic();
		
		System.out.println("Please enter three numbers");
		num1 = kb.nextDouble();
		num2 = kb.nextDouble();
		num3 = kb.nextDouble();
		
		average.average();
		average.print();
	}
	public void average()
	{
		avg = (num1+num2+num3)/3;
	}
	public void print()
	{
		System.out.println("The average of " + num1 + ", " + num2 + ",and " + num3 + " is " + avg);
	}
}