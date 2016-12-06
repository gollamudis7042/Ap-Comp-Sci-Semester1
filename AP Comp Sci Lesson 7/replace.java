import java.util.Scanner;

public class replace
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("type a string in");
		String s = kb.nextLine();
		
		r(s);
	}
	public static void r(String s)
	{
		int i=1;
		while(i<=s.length())
		{
			if((s.substring(i-1,i)).equals("a"))
				System.out.print("@");
			else
				System.out.print(s.charAt(i-1));
			i++;
		}
		
	}
}