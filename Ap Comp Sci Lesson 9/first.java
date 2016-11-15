import java.util.Scanner;

public class first
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("type 5 words in");
		String[] word = new String[5];
		for(int i=0;i<word.length;i++)
			word[i]=kb.next();
		first(word);
	}
	public static void first(String[] word)
	{
		for (String w : word)
		{
			System.out.println(w.substring(0,1));
		}
	}
}