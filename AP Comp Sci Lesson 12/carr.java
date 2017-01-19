import java.util.Scanner;


public class carr
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		car object = new car(kb.nextLine(),kb.nextLine(),kb.nextLine(),kb.nextLine());
		
		System.out.println("paint "+object.gP());
		System.out.println("interior "+object.gI());
		System.out.println("engine "+object.gE());
		System.out.println("tires "+object.gT());
	}
}