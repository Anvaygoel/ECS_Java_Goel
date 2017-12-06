import java.util.Scanner;

public class TwoQuestionJava 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		
		String Question , Question2;
		int animal, vegatable, mineral;
		
		
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, an i'll tey and guess what it is!");
		
		
		
		System.out.println(" Question 1) Is it an animal, vegatable or mineral?");
		Question = keyboard.next();
		
		
		System.out.println("Question 2) It is bigger then a beard box?");
		Question2 = keyboard.next();
		
		
		
		
		 if ( Question.equals("animal")&&Question2.equals("no"))
			{
				System.out.print("Is is a Squirel?!");
			}
		if ( Question.equals("animal")&&Question2.equals("yes"))
			{
				System.out.print("Is it a moose?");
			}
		if ( Question.equals("vegatable")&&Question2.equals("no"))
			{
				System.out.print("Is it a carrot?");
			}
		if ( Question.equals("vegatable")&&Question2.equals("yes"))
			{
				System.out.print("Is it a watermelon?");
			}
			if ( Question.equals("mineral")&&Question2.equals("no"))
			{
				System.out.print("Is it a paper clip?");
			}
			if ( Question.equals("mineral")&&Question2.equals("yes"))
			{
				System.out.print("Is it a camaro?");
			}
	}

}
