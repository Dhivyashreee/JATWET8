package guvitask8;

import java.util.Scanner;

public class Numberofdigits {
	
	public static void main(String[] args) {
		
		System.out.println("Enter an integer: ");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();
		int count = 0;
		a.close();
		
		while (num!= 0) {
			num= num/10;
			count++;
			
			}
		System.out.println("The number of digits in the given integer: " +count);	
	}
	

}
