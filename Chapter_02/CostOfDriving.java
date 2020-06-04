/*
 Author:	Stephen Lovell
 Date:		04 Jun 2020
 
 Takes as input driving distance, fuel efficiency,
 and cost of fuel, then returns the total cost
 for the trip.
 */

import java.util.Scanner;

public class CostOfDriving
{
	public static void main (String[] args)
	{
		//prompt for inputs
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter driving distance:");
		double distance = input.nextDouble();
		
		System.out.println("Enter miles per gallon:");
		double mileage = input.nextDouble();
		
		System.out.println("Enter cost per gallon:");
		double costPerGallon = input.nextDouble();
		
		//calculate total cost and output result
		
			/* total cost = cost per gallon * gallons used
			   gallons used = total distance / gas mileage
			   total cost = cost per gallon * (total distance / gas mileage)
			*/
		
		double totalCost = costPerGallon * (distance / mileage);
		System.out.println("Total cost of driving: $" + totalCost);
	}
}
