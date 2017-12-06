import java.util.Scanner;

public class BMICalcBetter 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double height, inches, pounds, BMI;
		
		 
		
		
		
		
		System.out.println("how many feet tall are you");
		height = keyboard.nextDouble();
		
		System.out.println("How many inches?");
		inches = keyboard.nextDouble();
		
		System.out.println("How many pounds do you weigh?");
		pounds = keyboard.nextDouble();
		BMI = (pounds*.4536/((height*.3048*height*.3048)));
		System.out.println("Your BMI is : " + BMI);
	
		if (BMI <18.5)
		{
			System.out.println("Your underwieght");
		}
		if (BMI >18.5&&BMI<25)
		{
			System.out.println("You are normal");
		}
		if (BMI >25&&BMI<30)
		{
			System.out.println("You are overwieght");
		}
		if (BMI >30)
		{
			System.out.println("You are obese");
		}
	}

	
}
