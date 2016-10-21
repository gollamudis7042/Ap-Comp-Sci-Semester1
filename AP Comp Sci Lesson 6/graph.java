import java.util.Scanner;

public class graph
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a table size");
		int size = kb.nextInt();
		System.out.println("Please enter an integer");
		int i = kb.nextInt();
		
		for(int n=1;n<=size;n++)
		{
			System.out.printf("%3d | %3d \n", n, (n*i));
		}
	}
}