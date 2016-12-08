import java.util.Scanner;

public class xo
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		String[][] xo = new String [4][4];
		
		for(int i=0;i<xo.length;i++)
		{
			for(int j=0;j<xo[i].length;j++)
			{
				int p = (int)(Math.random()*2)+1;
				if(p==1)
					xo[i][j]="x";
				if(p==2)
					xo[i][j]="o";
				System.out.print(xo[i][j]+"\t");
			}
			System.out.println();
		}
	}
}