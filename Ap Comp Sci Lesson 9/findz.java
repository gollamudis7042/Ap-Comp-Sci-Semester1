import java.util.Scanner;

public class findz
{
	static String[] word = new String[5];
	
	public static void main(String[]args)
	{
		fill();
		System.out.println("for the words");
		print();
		System.out.println("only " + has() + " contain(s) the letter z");
	}
	public static void fill()
	{
		Scanner kb = new Scanner(System.in);	
		
		System.out.println("enter 5 words");
		for(int i=0;i<word.length;i++)
			word[i]=kb.next();
	}
	public static void print()
	{
		for(int i=0;i<word.length;i++)
			System.out.print(word[i]+" ");
	}
	public static String has()
	{
		String zs= " ";
		for(String w : word)
		{
			if(w.indexOf("z")>=0)
				zs+= w + " ";
		}
		return zs;
	}
}