import java.util.Scanner;

public class distancer
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		distance object = new distance(kb.nextInt(),kb.nextInt(),kb.nextInt(),kb.nextInt());
		
		System.out.println("distance = "+object.getDist());
		
		object.mod(5,4,3,2);
		
		System.out.println("distance = "+object.getDist());
	}
}