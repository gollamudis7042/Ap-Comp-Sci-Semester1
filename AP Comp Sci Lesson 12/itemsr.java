import java.util.Scanner;

public class itemsr
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("will you enter price and category, y or n");
		
		if(kb.nextLine().equals("n"))
		{
			System.out.println("enter manufacturer and name");
			items object = new items(kb.nextLine(),kb.nextLine());
			System.out.println(object);
		}
		else
		{
			System.out.println("enter manufacturer, name, category, price");
			items object = new items(kb.nextLine(),kb.nextLine(),kb.nextLine(),kb.nextLine());
			System.out.println(object);			
		}	
	}
}
