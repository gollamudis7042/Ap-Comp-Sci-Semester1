import java.util.Scanner;

public class compound
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		compound interest = new compound();
		
		System.out.println("Please enter the interest rate");
		double r = kb.nextDouble();
		
		System.out.println("Please enter the principal amount");
		double p = kb.nextDouble();
		
		System.out.println("Please enter the number of times interest is compounded in years");
		double n = kb.nextDouble();
		
		System.out.println("Please enter the life of the loan in years");
		double t = kb.nextDouble();
		
		double monthly = interest.total(n,p,r,t);
		
		interest.format("Interest rate ", r);
		interest.format("Principal $",p);
		interest.format("number of times loan is compounded per year ", n);
		interest.format("life of the loan in years ", t);
		interest.format("Your total monthly payment is $", monthly);
	}
	public double total(double n, double p, double r, double t) 
	{
		double a = Math.pow(((r/n)+1),(n*t));
		return(p*a/12/t);
	}
	public void format(String stuff, double num)
	{
		System.out.printf("\n  %50s%5.2f", stuff, num);
	}
}
