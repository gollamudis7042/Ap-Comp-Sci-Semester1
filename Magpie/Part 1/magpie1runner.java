import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie WhiteB
 * @version April 2012
 */
public class magpie1runner
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		magpie1 maggie = new magpie1();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
