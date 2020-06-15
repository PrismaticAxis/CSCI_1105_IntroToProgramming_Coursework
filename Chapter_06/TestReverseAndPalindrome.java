/*
 	Author:	Stephen Lovell
 	Date:	15 Jun 2020
 	
 	takes an integer and returns its reversal (e.g., 456 becomes 654)
 	and says whether the integer is a palindrome.
 */

import java.util.Scanner;

public class TestReverseAndPalindrome
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int n = input.nextInt();
		
		System.out.println(
				n + " backwards is " + reverse(n));
		
		if (isPalindrome(n))
			System.out.println(n + " is a palindrome.");
		else
			System.out.println(n + " is not a palindrome");
	}
	
	public static int reverse(int n)
	{
		String reverse = "";		//ultimately the output
		String nString = n + "";	//string version of n
		
		//get reverse
		for (int i = nString.length() - 1; i >= 0; i--)
		{
			reverse = reverse + nString.charAt(i);
		}
		
		return Integer.parseInt(reverse);
	}
	
	public static boolean isPalindrome(int n)
	{
		if (n == reverse(n))
			return true;
		else
			return false;
	}

}
