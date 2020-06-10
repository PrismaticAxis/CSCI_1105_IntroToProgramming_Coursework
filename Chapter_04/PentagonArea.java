/*
 	Author: Stephen Lovell
 	Date:	10 Jun 2020
 	
 	Takes the radius for a pentagon as input and returns
 	the area.
 */

import java.util.Scanner;

public class PentagonArea
{

	public static void main(String[] args)
	{
		//user instructions
		System.out.println("\tArea of a Pentagon\n");
		System.out.println(
				"Enter the radius (distance from center to a vertex):");
		
		//prompt for input
		Scanner input = new Scanner(System.in);
		
		double radius = input.nextDouble();
		
		//check for valid input
		if (radius > 0)
		{
			//calculate side length, then area
			double side = 2 * radius * Math.sin(Math.PI / 5);
			double area = (5 * (side * side)) / (4 * Math.tan(Math.PI / 5));
			
			//output area
			System.out.println("Area: " + area);
		}
		else
			System.out.println("Invalid input; radius must be positive.");
	}

}
