public class biggest
{
	static int[] num = new int[10];
	
	public static void main(String[]args)
	{
		fill();
		System.out.println("For the numbers ");
		print();
		System.out.println(" The biggest number is " + get());
	}
	public static void fill()
	{
		for(int i = 0; i < num.length; i++)
		{
			num[i] = (int)(Math.random()*100)+1;
		}
	}
	public static void print()
	{
		for(int i=0;i<num.length;i++)
			System.out.print(num[i]+" ");
	}
	public static int get()
	{
		int max=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>=max)
				max=num[i];
		}
		return max;
	}
}
