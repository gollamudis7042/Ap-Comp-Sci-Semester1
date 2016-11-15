import java.util.Scanner;

public class reverse
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("type 5 words in");
		String[] word = new String[5];
		for(int i=0;i<word.length;i++)
			word[i]=kb.next();
		System.out.println("in order");
		for (String w : word)
		{
			System.out.println(w);
		}
		for (String w : word)
		{
			System.out.println(w);
			System.out.println("reversed");
			reverse(w);
		}
	}
	public static void reverse(String n)
	{
		for(int f=n.length()-1;f>=0;f--)
			System.out.print(n.substring(f,f+1));
		System.out.println(" ");
			
	}
}