import java.util.Scanner;

public class Ageln5 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age; 
		
		System.out.println("Hello. What is your name?");
		name = keyboard.next();
		
		System.out.println("Hi, " + name + "! how old are you?");
		age = keyboard.nextInt();
		
		System.out.println("Did you know that in five years you will be 20 years old? ");
		System.out.print("And five years ago you were 10! Imagine that!");
		
	}

}
