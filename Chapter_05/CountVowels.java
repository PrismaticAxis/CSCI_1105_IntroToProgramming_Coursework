/*
 	Author: Stephen Lovell
 	Date:	12 Jun 2020
 	
 	takes a string and returns the number of vowels
 	it contains.
 */

import java.util.Scanner;

public class CountVowels
{

	public static void main(String[] args)
	{
		//initial prompt and input
		System.out.println("Enter a string: ");
		
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		String stringLowerCase = string.toLowerCase();
		
		//count vowels
		int count = 0;
		
		for (int i = 0; i < string.length(); i++)
		{
			if (string.charAt(i) == 'a'
					|| string.charAt(i) == 'e'
					|| string.charAt(i) == 'i'
					|| string.charAt(i) == 'o'
					|| string.charAt(i) == 'u')
			{
				count++;
			}
		}
		
		//print result (with two output versions; just comment out the one you don't want to use)
		
		//System.out.println("Your string contains " + count + " vowels.");
		System.out.println("\"" + string + "\" contains " + count + " vowels.");
	}

}
