/*
 Author:	Stephen Lovell
 Date:		04 Jun 2020
 
 Takes an input of degrees Celsius and
 returns the equivalent Fahrenheit value.
 */

import java.util.Scanner;

public class CelsiusToFahrenheit
{
	public static void main(String[] args)
	{
		//get Celsius input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter degrees Celsius: ");
		double celsius = input.nextDouble();
		
		//convert to Fahrenheit
		double fahrenheit = 9d / 5 * celsius + 32;
		
		//output Fahrenheit
		System.out.println("Degrees Fahrenheit: " + fahrenheit);
	}
}
