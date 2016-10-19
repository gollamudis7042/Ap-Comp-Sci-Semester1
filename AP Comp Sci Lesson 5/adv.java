import java.util.Scanner;

public class adv
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please pick between going to school or ditching");
		String choice=kb.nextLine();
		
		if(choice.equals("ditching"))
		{
			System.out.println("Please pick between going to the highlands or the movies");
			choice=kb.nextLine();
			if(choice.equals("movies"))
			{
				System.out.println("Please pick between ordering coke or popcorn");
				choice=kb.nextLine();
				if(choice.equals("coke"))
					System.out.println("Good choice");
				else
					System.out.println("Bad choice");
			}	
			else
			{
				System.out.println("Please pick between McD's or Einstein");
				choice=kb.nextLine();
				if(choice.equals("Einstein"))
					System.out.println("Good choice");
				else
					System.out.println("Bad choice");
			}	
		}		
		else
		{	
			System.out.println("Please pick between paying attention or dgaf");
			choice=kb.nextLine();
			if(choice.equals("dgaf"))
			{
				System.out.println("Please pick between playing on your phone or sleeping");
				choice=kb.nextLine();
				if(choice.equals("sleeping"))
					System.out.println("Good night");
				else
					System.out.println("Have fun");
			}	
			else
			{	
				System.out.println("Please pick between torture or try hard");
				choice=kb.nextLine();
				if(choice.equals("torture"))
					System.out.println("You could've ditched school");
				else
					System.out.println("Actually a loser");
			}	
		}		
	}
}