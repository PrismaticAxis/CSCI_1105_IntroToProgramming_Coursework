/*
 Author:	Stephen Lovell
 Date:		04 Jun 2020
 
 Takes a monthly saving amount and
 returns the value after six months.
 */

import java.util.Scanner;


public class MonthlySaving
{
	public static void main(String[] args)
	{
		final double ANNUAL_INTEREST_RATE = 0.05;
		final double MONTHLY_INTEREST_RATE = ANNUAL_INTEREST_RATE / 12;
		
		//prompt for initial amount
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter monthly saving amount: ");
		double monthlyAmount = input.nextDouble();
		double accountValue = monthlyAmount;

		//calculate value after one month
		accountValue = accountValue * (1 + MONTHLY_INTEREST_RATE);
		
		//calculate value after two months
		accountValue = (accountValue + monthlyAmount) * (1 + MONTHLY_INTEREST_RATE);
		
		//...after three months
		accountValue = (accountValue + monthlyAmount) * (1 + MONTHLY_INTEREST_RATE);

		//...after four months
		accountValue = (accountValue + monthlyAmount) * (1 + MONTHLY_INTEREST_RATE);
		
		//...after five months
		accountValue = (accountValue + monthlyAmount) * (1 + MONTHLY_INTEREST_RATE);
		
		//...after six months
		accountValue = (accountValue + monthlyAmount) * (1 + MONTHLY_INTEREST_RATE);
		
		//output result
		System.out.println("After six months, the account value is " + accountValue);
	}
}
