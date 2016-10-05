public class rolldice
{
	static int one, two;
	
	public static void main(String[]args)
	{
		one = 1+(int)((Math.random()* 6));
		two = 1+(int)((Math.random()* 6));
		
		System.out.println("You rollled a " + one);
		System.out.println("The computer rolled a " + two);
		
		System.out.println("the winner is " + print());
	}
	public static String print()
	{
		String s = ("");
		if(one>two)
			s = "you";
		if(one<two)
			s = "the computer";
		return s;
	}
}