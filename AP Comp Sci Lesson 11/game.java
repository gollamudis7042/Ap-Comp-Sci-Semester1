import java.util.Scanner;

public class game
{
	static int bc;
	static int cs=16;
	static int sc;
	static String[] clip;
	
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		
		bc=96;
		sc=0;
		clip= new String[cs];
		
		resetClip();
		
		while(bc>0||sc>0)
		{
			System.out.println("Action");
			String action=kb.next();
			if(action.equals("R"))
				reload();
			else if(action.equals("S"))
				System.out.println(shoot());
			
			printClip();
		}
		System.out.println("out of bullets");
	}
	public static void resetClip()
	{
		for(int i=0;i<clip.length;i++)
			clip[i]="[]";
	}
	public static String shoot()
	{
		if(sc>0)
		{
			clip[sc-1]="[]";
			sc--;
			return "boom!";
		}
		else
		{
			return "reload";
		}
	}
	public static void reload()
	{
		if(bc>=cs)
		{
			bc-=cs;
			sc=cs;
		}
		else
		{
			sc=bc;
			bc=0;
		}
		
		resetClip();
		
		for(int i=0; i<sc;i++)
		{
			clip[i]= " * ";
		}
	}
	public static void printClip()
	{
		String o= "";
		System.out.println("Bullets: \t" + bc + "\nClip: \t");
		for(int i=0;i<cs;i++)
		{
			o+=clip[i];
		}
		System.out.println(o);
	}
}