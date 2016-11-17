import java.util.Scanner;

public class center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("type three words in");
		mC(kb.next());
		mC(kb.next());
		mC(kb.next());
		
	}
	public static void mC(String s)
	{
		if(s.length()>=20)
			System.out.println(s);
		else
			mC(" "+s+" ");
	}
}