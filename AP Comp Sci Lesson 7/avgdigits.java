import java.util.Scanner;

public class avgdigits
{
	public static void main(String[]args)
	{
		double d =0; double a = 0;
		adD(d, a);
	}
	public static void adD(double d, double a)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a number");
		int num = kb.nextInt();
		
		while(num>0)
		{
			a = a+ (num%10);
			d+=1;
			num/=10;
		}
		System.out.println("average is " + a/d);
	}
}