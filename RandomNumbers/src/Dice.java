import java.util.Random;

public class Dice 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int x =  r.nextInt(6);
		int y =  r.nextInt(6);
		
		System.out.println("HERE COMES THE DICE!");
		System.out.println("Roll#1: " +  y);
		
		System.out.println("Roll#2 : "  + x);
		
		System.out.println("The Total is " + (y+x));
	
		
	}

}
