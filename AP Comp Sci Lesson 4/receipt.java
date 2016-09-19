import java.util.Scanner;

public class receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		receipt form = new receipt();
		
		System.out.println("Please enter item 1");
		String s = kb.nextLine();
		System.out.println("Please enter the price");
		Double d = kb.nextDouble();
		
		System.out.println("Please enter item 2");
		kb.nextLine();
		String s1 = kb.nextLine();
		System.out.println("Please enter the price");
		Double d1 = kb.nextDouble();
		
		System.out.println("Please enter item 3");
		kb.nextLine();
		String s2 = kb.nextLine();
		System.out.println("Please enter the price");
		Double d2 = kb.nextDouble();
		
		String s3 = "<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>";
		System.out.printf("\n%41s", s3);
		
		form.format(s,d);
		form.format(s1,d1);
		form.format(s2,d2);
		
		String s4 = "___________________________________________________";
		System.out.printf("\n%41s", s4);
		
		String s5 = " * Thank you for your support *";
		System.out.printf("\n%41s", s5);
	}
	public void format(String stuff, double num)
	{
		System.out.printf("\n * %15s .......  %4.2f", stuff, num);
	}
}
