package guvitask8;

import java.util.Scanner;
public class Seniorcitizen {
	public static void main(String[] args)
	{
		System.out.println("Enter the age: ");
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		n.close();
		if(a<60)
		{
			System.out.println("The person is not senior citizen");
		}
		else
		{
			System.out.println("The person is senior citizen");
		}
		}
	}
