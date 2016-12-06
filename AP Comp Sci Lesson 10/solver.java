import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class solver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter an equation: ");
		String e = kb.nextLine();
		
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(e.split(" ")));
		d(equation);
	}
	public static void d(ArrayList<String> e)
	{	
		int i=0;
		while(i<e.size())
		{
			if(e.get(i).equals("+"))
			{
				e.set(i, "" + (Integer.parseInt(e.get(i-1)) + Integer.parseInt(e.get(i+1))));
				e.remove(i-1);
				e.remove(i);
			}
			else if(e.get(i).equals("-"))
			{
				e.set(i, "" + (Integer.parseInt(e.get(i-1)) - Integer.parseInt(e.get(i+1))));
				e.remove(i-1);
				e.remove(i);
			}
			else if(e.get(i).equals("*"))
			{
				e.set(i, "" + (Integer.parseInt(e.get(i-1)) * Integer.parseInt(e.get(i+1))));
				e.remove(i-1);
				e.remove(i);
			}
			else if(e.get(i).equals("/"))
			{
				e.set(i, "" + (Integer.parseInt(e.get(i-1)) / Integer.parseInt(e.get(i+1))));
				e.remove(i-1);
				e.remove(i);
			}
			else
				i++;
		}
		System.out.println(e);
	}
}