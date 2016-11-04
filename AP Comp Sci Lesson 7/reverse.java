import java.util.Scanner;

public class reverse
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = kb.nextInt();
		int rev = 0;
		r(num,rev);
	
	}
	public static void r(int n, int r)
	{
		while(n>0)
		{
			r=(r+(n%10))*10;
			n/=10;
			
		}
		r/=10;
		System.out.println(r);
	}
}