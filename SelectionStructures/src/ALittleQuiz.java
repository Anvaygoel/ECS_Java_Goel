import java.util.Scanner;

public class ALittleQuiz
{
	private static Scanner close;

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int answer;
		int answerC=0, numAnswersCorrect=0;
		
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("1) Melbourne");
		System.out.println("2) Anchorage");
		System.out.println("3) Juneau");
		answer = keyboard.nextInt();
		
		if ( answer >2&&answer<4)
		{
			System.out.println("That's correct!");
			numAnswersCorrect++;
		}
		else
		{
			System.out.println(" Sorry try again :(");
			
		}
		
		
		System.out.println("Q2) Can you store the value cat in a variable of type int?");
		System.out.println("1) yes");
		System.out.println("2) no");
		answer = keyboard.nextInt();
		
		if ( answer >1&&answer<3)
		{
			System.out.println("That is correct!");
			numAnswersCorrect++;
		}
		else
		{
			System.out.println("Sorry, cat is a string. ints can only store numbers. :(");
		}
		
		System.out.println("Q3) what is the result of 9+6/3?");
		System.out.println("1) 5");
		System.out.println("2) 11");
		System.out.println("3) 15/3");
		answer = keyboard.nextInt();
		if ( answer >0&&answer<2)
		{
			System.out.println("Thats correct");
			numAnswersCorrect++;
			
		}
		else
		{
			System.out.println(" Sorry that's not correct :(");
			
		}
		
		 
		
		System.out.print("Overall, your got " + numAnswersCorrect + " out of 3 correct. Thanks for playing!");
		
		
		

		
		close = keyboard;
		
	}

}