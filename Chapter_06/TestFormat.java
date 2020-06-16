/*
 	Author: Stephen Lovell
 	Date:	16 Jun 2020
 	
 	takes two integers and outputs the first preceded by enough
 	zeros to make (at least) a number of digits equal to the second.
 */

import java.util.Scanner;

public class TestFormat
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int n = input.nextInt();
		
		System.out.println("Enter width:");
		int w = input.nextInt();
		
		System.out.println("\n" + format(n, w));
	}

	public static String format(int n, int w)
	{
		String output = "";
		String nString = n + "";
		
		while (output.length() + nString.length() < w)
			output = output + "0";
		output += nString;
		
		return output;
	}
	
}
