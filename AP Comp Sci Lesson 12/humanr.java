import java.util.Scanner;

public class humanr
{
	
	public static void main(String[]args)
	{
	Scanner kb = new Scanner(System.in);
	
	human object = new human(kb.nextLine(),kb.nextLine(),kb.nextLine());
	
	System.out.println("My info...");
	System.out.println("Hair "+object.gH());
	System.out.println("Eyes "+object.gE());
	System.out.println("Skin "+object.gS());
	
	object.mod("Black","Green","White");
	
	System.out.println("Friend info...");
	System.out.println("Hair "+object.gH());
	System.out.println("Eyes "+object.gE());
	System.out.println("Skin "+object.gS());
	}
}