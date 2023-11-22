package guvitask8;

import java.util.Scanner;

public class Greater {
	
	
	public static void main(String[] args) {
		
	System.out.println("Enter the numbers: ");	
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();
	int d = s.nextInt();
	s.close();
	int sum1, sum2;
	sum1 = a+b;
	sum2 = c+d;
	
	if(sum1>sum2) {
		System.out.println(" The sum of a and b is greater than sum of c and d");
	}
	else
	{
	System.out.println(" The sum of c and d is greater than sum of a and b");
	}
	}
}
