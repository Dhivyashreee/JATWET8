package guvitask8;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		
		System.out.println("Enter the numbers: ");
		Scanner sw = new Scanner(System.in);
		int a = sw.nextInt();
		int b = sw.nextInt();
		sw.close();
		int temp = a;
		
		a = b;
		b = temp;
		System.out.println("After swap ");
		System.out.println("First number: " +a);
		System.out.println("Second number: " +b);
		
	}
}
