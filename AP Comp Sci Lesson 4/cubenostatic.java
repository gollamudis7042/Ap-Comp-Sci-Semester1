import java.util.Scanner;

public class cubenostatic
{
	static double side, sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		cubenostatic cube = new cubenostatic();
		
		System.out.println("Please enter the side length");
		side = kb.nextDouble();
		
		cube.calcSurf();
		cube.print();
	}
	public void calcSurf()
	{
		sa = (side*side*6);
	}
	public void print()
	{
		System.out.println("The surface area of a cube with side length " + side + " is " + sa);
	}
}