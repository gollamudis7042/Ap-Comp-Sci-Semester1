import java.util.Scanner;

public class average
{
	static double num1, num2, num3;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter three numbers");
		num1 = kb.nextDouble();
		num2 = kb.nextDouble();
		num3 = kb.nextDouble();
		
		print();
	}
	public static double average()
	{
		return (num1+num2+num3)/3;
	}
	public static void print()
	{
		System.out.println("The average of " + num1 + ", " + num2 + ",and " + num3 + " is " + average());
	}
}