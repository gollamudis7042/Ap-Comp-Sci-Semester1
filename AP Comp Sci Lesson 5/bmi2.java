import java.util.Scanner;

public class bmi2
{
	static double height,weight;
	static double bmi = 0;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches");
		height = kb.nextDouble();
		System.out.println("Please enter your weight in pounds");
		weight = kb.nextDouble();
		
		calcBMI(height,weight);
		
		System.out.println("Your BMI is " + bmi + "\nYou are " + condition);
	}
	public static void calcBMI(double height,double weight)
	{
		bmi = 703*(weight/(height)*(height));
		
		if(bmi>39.9)
			condition = "morbidly obese";
		else if(bmi>35)
			condition = "very obese";
		else if(bmi>29.9)
			condition = "obese";
		else if(bmi>25)
			condition = "overweight";
		else if(bmi>=18.5)
			condition = "nomral";
		else if(bmi<18.5)
			condition = "underweight";
	}
}