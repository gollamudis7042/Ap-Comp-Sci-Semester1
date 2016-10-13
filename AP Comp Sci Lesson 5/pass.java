import java.util.Scanner;

public class pass
{	
	public static void main(String[]args)
	{		
		passCheck();
	}
	public static void passCheck()
	{
		Scanner kb = new Scanner(System.in);
		
		String password,username;
		
		System.out.println("Please enter the username");
		username=kb.next();
		System.out.println("Please enter the password");
		password=kb.next();
		
		if(password.equals("y") && username.equals("n"))
		{
			System.out.println("You are granted access");
		}	
		else
		{	
			if(username.equals("n"))
			{
				System.out.println("Your password is incorrect");
				passCheck();
			}	
			if(password.equals("y"))
			{
				System.out.println("Your username is incorrect");
				passCheck();
			}
			else
			{
				System.out.println("Your username and password are incorrect");
				passCheck();
			}
		}
	}
}