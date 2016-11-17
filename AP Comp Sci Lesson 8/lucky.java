import java.util.Scanner;

public class lucky
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("type a number in");
		System.out.println(luck(kb.nextInt()));
		
	}
	public static int luck(int s)
	{
		if(s>0)
		{
			if(s%10==7)
				return 1+luck(s/10);
			else
				return 0+luck(s/10);	
		}
		else
			return 0;
	}
}