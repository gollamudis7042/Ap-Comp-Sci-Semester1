import java.util.Scanner;
public class toystorer
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		toystore t = new toystore(kb.nextLine());
		System.out.println(t);
		System.out.println(t.getFToy());
		System.out.println(t.getFType());
	}
}