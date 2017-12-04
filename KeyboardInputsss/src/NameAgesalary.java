import java.util.Scanner;

public class NameAgesalary 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner( System.in);
		
		String name;
		int age, salary;
		
		System.out.println("Hello. What is your name?");
		name = keyboard.next();
		
		System.out.println("Hi, " + name + "! how old are you?");
		age = keyboard.nextInt();
		
		System.out.println("So your are " + age + "? I guess that's not that too old, " + name + ". How much do you make per hour? ");
		salary = keyboard.nextInt();
		
		System.out.println("Wow, " + salary + " is a lot for your age!");
		
		
		
	}

}
