

public class song
{
	public static void main(String[]args)
	{
		song("Na",4);
		song("Na",4);
		song("Hey",3);
		song("Goodbye!",1);
	}
	public static void song(String s, int i)
	{
		for(int n=1;n<=i;n++)
		{
			System.out.printf("%s \t",s);
			
		}
		System.out.println("");
	}
}