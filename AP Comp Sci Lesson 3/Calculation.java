import java.util.Scanner;

public class Calculation
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me a length");
		int num = keyboard.nextInt();
		System.out.println("Give me a height");
		int num1 = keyboard.nextInt();
		System.out.println("A rectangle with length " + num + " and height " + num1 + " has an area of " + num * num1 + ".");
	}
}