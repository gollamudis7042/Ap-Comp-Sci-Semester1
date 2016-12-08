import java.util.Scanner;

public class div
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		int[][] nums = new int [4][4];
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				nums[i][j]=(int)(Math.random()*100)+1;
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("enter a number");
		int d = kb.nextInt();
		int c = 0;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				if(nums[i][j]%d==0)
					c++;
			}
		}
		
		System.out.println("There are " + c + " numbers divisible by " + d + " in the array");
	}
}