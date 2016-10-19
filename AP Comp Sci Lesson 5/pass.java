import java.util.Scanner;

public class pass
{	
	public static void main(String[]args)
	{	
		String pass = "y";
		String user = "n";
		
		passCheck(user, pass);
	}
	public static void passCheck(String user, String pass)
	{
		Scanner kb = new Scanner(System.in);
		
		String password,username;
		
		System.out.println("Please enter the username");
		username=kb.next();
		System.out.println("Please enter the password");
		password=kb.next();
		
		if(password.equals(pass) && username.equals(user))
		{
			System.out.println("You are granted access");
		}	
		else
		{	
			if(username.equals(user))
			{
				System.out.println("Your password is incorrect");
				passCheck(user, pass);
			}	
			if(password.equals(pass))
			{
				System.out.println("Your username is incorrect");
				passCheck(user, pass);
			}
			else
			{
				System.out.println("Your username and password are incorrect");
				passCheck(user, pass);
			}
		}
	}
}