import java.util.Scanner;

public class idcard
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		idcard form = new idcard();
		
		System.out.println("Enter your first name:");
		String s = kb.nextLine();
		System.out.println("Enter your last name:");
		String s1 = kb.nextLine();
		System.out.println("Enter your title:");
		String s2 = kb.nextLine();
		System.out.println("Enter the school site:");
		String s3 = kb.nextLine();
		System.out.println("Enter the school year:");
		String s4 = kb.nextLine();
		System.out.println("What is your subject?");
		String s5 = kb.nextLine();
		
		String stuff = "***********************************";
		System.out.printf("\n%35s", stuff);
		
		form.format(s3,s4);
		form.format(s,s1);
		form.format(s2,s5);
		
		String stuff1 = "***********************************";
		System.out.printf("\n%35s", stuff1);
	}
	public void format(String stuff, String blah)
	{
		System.out.printf("\n * %15s  %15s  *", stuff, blah);
	}
}