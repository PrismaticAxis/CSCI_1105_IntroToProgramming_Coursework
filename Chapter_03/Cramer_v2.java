/*
	Author:	Stephen Lovell
	Date:	09 Jun 2020
	
	Solves for x and y in a 2x2 system of linear equations
	from user-supplied input.
 */

import java.util.Scanner;

public class Cramer_v2 {

	public static void main(String[] args)
	{
		//user instructions
		System.out.println("	Cramer's Rule");
		System.out.println("Input values of the form:");
		System.out.println("ax + by = e     cx + dy = f");
		System.out.println("");
		
		//get input
		Scanner input = new Scanner(System.in);
		
		System.out.println("a: ");
		double a = input.nextDouble();
		System.out.println("b: ");
		double b = input.nextDouble();
		System.out.println("c: ");
		double c = input.nextDouble();
		System.out.println("d: ");
		double d = input.nextDouble();
		System.out.println("e: ");
		double e = input.nextDouble();
		System.out.println("f: ");
		double f = input.nextDouble();
		
		//check for solvable values and solve
		double denominator = a * d - b * c;
		final double EPSILON = 1E-14;
		
			//a little trick from the book to prevent rounding error
		if (Math.abs(denominator) < EPSILON)
			System.out.println("No solution. Cannot divide by zero");
		else
		{
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}
}
