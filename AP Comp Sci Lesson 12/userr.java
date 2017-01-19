import java.util.Scanner;

public class userr
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("First name");
		String f=kb.nextLine();
		System.out.println("Last name");
		String l=kb.nextLine();
		System.out.println("public avatar, y or n");
		String a=kb.nextLine();
		
		if(a.equals("n"))
		{
			user p1 = new user(f, l);
			System.out.println(p1);
		}
		else
		{
			System.out.println("avatar name");
			user p2 = new user(f, l,kb.nextLine());
			System.out.println(p2);
		}
	}
}