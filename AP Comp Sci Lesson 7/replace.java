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
		int i=0;
		while(i<s.length())
		{
			int f = s.indexOf("a");
			if(f == i)
				System.out.printf("@");
			else
				System.out.printf("%s",s.charAt(i));
			i++;
		}
		
	}
}