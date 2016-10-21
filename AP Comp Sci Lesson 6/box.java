import java.util.Scanner;

public class box
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a word");
		String word = kb.nextLine();
		int w = word.length();
		
		for(int i=0;i<=w; i++)
		{
			System.out.println(word);
		}
	}
}