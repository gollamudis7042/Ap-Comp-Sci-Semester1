import java.util.Scanner;

public class game
{
	static int bc, sc;
	static int cs=16;
	static String[] c;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		bc=96;
		sc=0;
		c= new String[cs];
		
		resetClip();
		
		while(bc>0 || sc>0)
		{
			System.out.println("Action");
			String action=kb.next();
			if(action.equals("R"))
				reload();
			if(action.equals("S"))
				System.out.println(shoot());
		}
		printClip();
	}
	public static void resetClip()
	{
		for(int i=0;i<c.length;i++)
			c[i]="[]";
	}
	public static String shoot()
	{
		if(sc>0)
		{
			c[sc-=1]="[]";
			sc-=1;
			return "Boom!!!";
		}
		else
			return "Reload!!!";
	}
	public static void reload()
	{
		if(bc>=cs)
		{
			bc=bc-cs;
			sc=cs;
		}
		else
		{
			sc=bc;
			bc=0;
		}
		resetClip();
		for(int i=0;i<sc;i++)
			c[i]=" * ";
	}
	public static void printClip()
	{
		String o="";
		o+="Bullets:" + "\t" + bc + "\n" + "Clip:" + "\t";
		for(int i=0;i<cs;i++)
			o=o+c[i];
		System.out.println(o);
	}
}