import java.util.Scanner;

public class game2
{
	static String[] h;
	static int hl=6;
	static int hc;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		String turn = "";
		int d=0;
		int a=0;
		
		hc=6;
		h= new String[hl];
		
		while(!turn.equals("Q") && hc>0)
		{
			System.out.println("Your turn. Hit enter when ready");
			turn=kb.next();
			d=(int)(Math.random()*2)+1;
			a=(int)(Math.random()*6)+1;
		}
		System.out.println(takeD(a,d));
		printClip();
	}
	public static String takeD(int a, int d)
	{
		if(d==1)
		{
			hc=hc-a;
			return "Taking " + a + " damage";
		}
		else	
		{
			if(hc+a<hl)
				hc=hc+a;
			else
				hc=hl;
			return "Power up " + a;
		}
	}
	public static void printClip()
	{
		String output = "Health" + "\t";
		for(int i=0;i<hc;i++)
		{
			if(i<hc)
				h[i]=" @ ";
			else
				h[i]= "[]";
			output=output+h[i];
		}
		System.out.println(output);
	}
}