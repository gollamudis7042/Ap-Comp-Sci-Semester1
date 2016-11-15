import java.util.Scanner;

public class fibonacci
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter start number");
		int s = kb.nextInt();
		System.out.println("enter sequence size");
		int se = kb.nextInt();
		
		int[] seq = new int[se];
		
		for(int i=0;i<=se;i++)
		{
			if(i==0 || i==1)
				seq[i]=s;
			else
				seq[i] = seq[i-1]+seq[i-2];
			System.out.println(seq[i]+" ");
		}	
	}
}