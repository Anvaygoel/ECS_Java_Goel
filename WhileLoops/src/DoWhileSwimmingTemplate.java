import java.util.Scanner;

public class DoWhileSwimmingTemplate 
{
	public static void main(String[] args) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		
		String swimmer1 = " GALLANT";
		String swimmer2 = "GOOFUS";
		
		double minimunTemperature = 79.0; // degrees Front
		double currentTemperature;
		double savedTemperature;
		int swimtime;
		
		System.out.println("What is the currect water temperature? ");
		currentTemperature = keyboard.nextDouble();
		savedTemperature =currentTemperature; // saves a copy of this value so we can get back in later
		
		
		System.out.println("\nOkay, so the current water temperature is " + currentTemperature + "F.");
		System.out.println(swimmer1 + " approches the lake. . . .");
		
		swimtime = 0;
		while ( currentTemperature >= minimunTemperature )
		{
			System.out.println("\t" + swimmer1 + " swims for a bit.");
			swimtime++;
			System.out.println("Swim time; " + swimtime + " min.");
		Thread.sleep(600);; // pauses for 600 milliseconds.
		currentTemperature -= 0.5; // Subtracts 1/2 a degree from the water temp
		System.out.println("tThe current water temperature is now" + swimtime + " min.");
		
		

		}
		
		System.out.println(swimmer1 + " stops swimming. total swim time: " + swimtime + "min.");
	
	}
}
