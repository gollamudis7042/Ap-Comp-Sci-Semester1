import java.util.Scanner;

public class underscores
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
		if(s.indexOf(" ")<0)
			System.out.println(s);
		else
			r(s.substring(0,s.indexOf(" "))+"_"+s.substring(s.indexOf(" ")+1));
	}
}