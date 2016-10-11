import java.util.Scanner;

public class gpa
{
	static String math,science,english,history,spanish,compsci,other;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your math grade");
		math = kb.next();
		System.out.println("Please enter your science grade");
		science = kb.next();
		System.out.println("Please enter your history grade");
		history = kb.next();
		System.out.println("Please enter your english grade");
		english = kb.next();
		System.out.println("Please enter your spanish grade");
		spanish = kb.next();
		System.out.println("Please enter your compsci grade");
		compsci = kb.next();
		System.out.println("Please enter your other grade");
		other = kb.next();
		
		System.out.println("Your gpa is " +((calcPoints(math)+calcPoints(science)+calcPoints(spanish)+
		calcPoints(english)+calcPoints(history)+calcPoints(compsci)+calcPoints(other))/7));
		
	}
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		else
			return 0;
	}
}