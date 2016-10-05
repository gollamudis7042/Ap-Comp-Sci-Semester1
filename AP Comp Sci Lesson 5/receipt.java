import java.util.Scanner;

public class receipt
{
	static double n, n1, n2, n3;
	static double total;
	static double discount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1");
		String s = kb.nextLine();
		System.out.println("Please enter the price");
		n = kb.nextDouble();
		
		System.out.println("Please enter item 2");
		kb.nextLine();
		String s1 = kb.nextLine();
		System.out.println("Please enter the price");
		n1 = kb.nextDouble();
		
		System.out.println("Please enter item 3");
		kb.nextLine();
		String s2 = kb.nextLine();
		System.out.println("Please enter the price");
		n2 = kb.nextDouble();
		
		System.out.println("Please enter item 4");
		kb.nextLine();
		String s3 = kb.nextLine();
		System.out.println("Please enter the price");
		n3 = kb.nextDouble();
		
		total = n+n1+n2+n3;
		
		String r = "<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>";
		System.out.printf("\n%41s", r);
		
		discount();
		
		format(s,n);
		format(s1,n1);
		format(s2,n2);
		format(s3,n3);
		format("total",total);
		format("discount",discount);
		
		String s4 = "___________________________________________________";
		System.out.printf("\n%41s", s4);
		
	}	
	public static void discount()
	{
		if(total>=2000)
			discount = 0.15*total;
		    total = total - 0.15*total;
		if(total<2000)
			total = total;
		    discount  = 0;
	}
	public static void format(String stuff, double num)
	{
		System.out.printf("\n * %15s .......  %4.2f", stuff, num);
	}
}