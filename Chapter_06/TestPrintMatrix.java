/*
 	Author:	Stephen Lovell
 	Date:	15 Jun 2020
 	
 	takes an int n and prints an n-by-n matrix of randomly
 	generated 0s and 1s.
 */

import java.util.Scanner;

public class TestPrintMatrix
{

	public static void main(String[] args)
	{
		//prompt for matrix size
		Scanner input = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = input.nextInt();
		
		printMatrix(n);
	}
	
	public static int random0To1()
	{
		return (int)(Math.random() * 2);
	}
	
	public static void printMatrix(int n)
	{
		for (int i = 0; i < n; i++)
			printRow(n);
	}
	
	public static void printRow(int n)
	{
		//opening bracket
		System.out.print("[ ");
		
		//row contents
		for (int i = 0; i < n; i++)
			System.out.printf("%3d", random0To1());
		
		//closing bracket
		System.out.println("  ]");
	}

}
