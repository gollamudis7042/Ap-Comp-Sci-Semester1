import java.util.Scanner;

public class adv
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please pick between 0 and 1");
		int choice=kb.nextInt();
		
		if(choice == 1)
		{
			System.out.println("Please pick between 2 and 3");
			choice=kb.nextInt();
			if(choice==2)
			{
				System.out.println("Please pick between 4 and 5");
				choice=kb.nextInt();
				if(choice==4)
					System.out.println("End");
				else
					System.out.println("End");
			}	
			else
			{
				System.out.println("Please pick between 6 and 7");
				choice=kb.nextInt();
				if(choice == 6)
					System.out.println("End");
				else
					System.out.println("End");
			}	
		}		
		else
		{	
			System.out.println("Please pick between 8 and 9");
			choice=kb.nextInt();
			if(choice == 8)
			{
				System.out.println("Please pick between 10 and 11");
				choice=kb.nextInt();
				if(choice==10)
					System.out.println("End");
				else
					System.out.println("End");
			}	
			else
			{	
				System.out.println("Please pick between 12 and 13");
				choice=kb.nextInt();
				if(choice==12)
					System.out.println("End");
				else
					System.out.println("End");
			}	
		}		
	}
}