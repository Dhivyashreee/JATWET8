package guvitask8;

import java.util.Scanner;

public class Factorial {
	
public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
		
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		n.close();
		int fact= 1;
		
		for (int i=1; i<=num; i++) {
			fact= fact*i;
		}
		System.out.println("Factorial of " + num + " is " +fact);
		
		
	}


}
