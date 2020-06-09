/*
 	Author:	Stephen Lovell
 	Date:	09 Jun 2020
 	
 	Takes side lengths for a triangle and returns
 	the perimeter.
 */

import java.util.Scanner;

public class TrianglePerimeter {

	public static void main(String[] args)
	{
		//user instructions
		System.out.println("   Triangle Perimeter");
		System.out.println("Enter side lengths");
		System.out.println("");
		
		//prompt for input
		Scanner input = new Scanner(System.in);
		
		System.out.println("a: ");
		double a = input.nextDouble();
		System.out.println("b: ");
		double b = input.nextDouble();
		System.out.println("c: ");
		double c = input.nextDouble();
		
		//check for valid inputs, and if we're good, calculate and output
		
			//check individual side lengths
		if (a <= 0 || b <= 0 ||c <= 0)
			System.out.println(
					"Invalid input: side lengths must all be positive");
		else if (a + b <= c || b + c <= a || c + a <= b)
			System.out.println(
					"Invalid input: given values cannot form a triangle");
		else
		{
			double perimeter = a + b + c;
			System.out.println(
					"Perimeter = " + perimeter);
		}
	}
}
