import java.util.Scanner;

public class RudeAI 
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println(name + "? What a terrible name");
		System.out.println("How old are you " + name);
		int age = keyboard.nextInt();
		System.out.println(age + ", That's getting up there");
		keyboard.nextLine();
		System.out.println("What do you do for fun " + name);
		String fun = keyboard.nextLine();
		System.out.println(fun + ", Only nerds like that");
		System.out.println("What kind of music do you like");
		String music = keyboard.nextLine();
		System.out.println(music + " sucks");
		System.out.println("How many siblings do you have");
		int siblings = keyboard.nextInt();
		System.out.println(siblings + ", That's too bad");
		keyboard.nextLine();
		System.out.println("What do you want to be when you grow up");
		String job = keyboard.nextLine();
		System.out.println(job + ", You need to be actually smart for that");
		System.out.println("Just kidding, good luck "+name);
	}
}