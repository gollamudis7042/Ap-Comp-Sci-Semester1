import java.util.Scanner;

public class lefttriangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a word");
		String s = kb.nextLine();
		
		int n = s.length();
		
		for(int i=0;i<=n;i++)
		{
			System.out.println(s.substring(i));
		}
	}
}