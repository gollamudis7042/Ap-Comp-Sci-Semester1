public class average
{
	public static void main(String[]args)
	{
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++)
		{
			num[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("numbers");
		for(int i=0;i<num.length;i++)
			System.out.print(num[i]+" ");
		System.out.println(" ");
		System.out.println("average is " + average(num));
	}
	public static int average(int[] a)
	{
		int av = 0;
		for(int b : a)
		{
			av +=b;
		}
		return av/10;
	}
}