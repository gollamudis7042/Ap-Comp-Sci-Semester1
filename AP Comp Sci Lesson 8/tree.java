import java.util.Scanner;

public class tree
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("type a word in");
		String t = kb.next();
		int s = t.length();
		tree(t,s,1);
	}
	public static void tree(String s,int s1, int s2)
	{
		if(s2<=s1)
		{
			System.out.printf("%5s  \n",s.substring(0,s2));
			s2+=1;
			tree(s,s1,s2);
		}
	}
}