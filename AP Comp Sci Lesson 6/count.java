import java.util.Scanner;

public class count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a end number");
		int n = kb.nextInt();
		System.out.println("Please enter a increment factor");
		int n1 = kb.nextInt();
		
		for(int i=n1;i<=n;i+=n1)
		{
			System.out.printf("%3d \t",i);
		}
	}
}