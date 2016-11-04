import java.util.Scanner;

public class digitadder
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = kb.nextInt();
		int sum = 0;
		sumD(num,sum);
	}
	public static void sumD(int num, int sum)
	{
		while(num>0)
		{
			sum = sum + (num % 10);
			num = num/10;
		}
		System.out.println("the sum of the digits is " + sum);
	}
}
	