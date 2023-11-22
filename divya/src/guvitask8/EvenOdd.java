package guvitask8;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args)
	{
		System.out.println("Enter the number: ");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		input.close();
		if(a % 2 ==0)
		{
			System.out.println( a  + " is an even number");
		}
		else
		{
			System.out.println( a  + " is an odd number");
			
		}
		
	}
}
