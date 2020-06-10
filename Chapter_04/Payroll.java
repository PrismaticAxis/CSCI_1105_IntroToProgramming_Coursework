/*
 	Author:	Stephen Lovell
 	Date:	10 Jun 2020
 	
 	Takes employee information and returns payroll information.
 */

import java.util.Scanner;

public class Payroll
{
	
	public static void main(String[] args)
	{
		//collect input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String employeeName = input.nextLine();
		
		System.out.print("Enter number of hours worked: ");
		double hoursWorked = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: $");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		//check for valid inputs
		if (hoursWorked < 0
				|| payRate < 0
				|| federalTaxRate < 0
				|| stateTaxRate < 0)
			System.out.println("One or more invalid inputs.");
		else
		{
			//calculate other values
			double grossPay		= hoursWorked	* payRate;
			double federalTax	= grossPay		* federalTaxRate;
			double stateTax		= grossPay		* stateTaxRate;
			double totalTax		= federalTax	+ stateTax;
			double netPay		= grossPay		- totalTax;
			
			//print payroll
			System.out.println("Employee Name:\t\t" + employeeName);
			System.out.printf("Hours Worked:\t\t%1.1f\n", hoursWorked);
			System.out.printf("Hourly Pay Rate:\t$%1.2f\n", payRate);
			System.out.printf("Gross Pay:\t\t$%1.2f\n", grossPay);
			System.out.println("Deductions:");
			System.out.printf("\tFederal Withholding:\t$%2.2f\n", federalTax);
			System.out.printf("\tState Withholding:\t$%2.2f\n", stateTax);
			System.out.printf("\tTotal Deduction:\t$%2.2f\n", totalTax);
			System.out.printf("Net Pay:\t\t$%2.2f", netPay);
		}
	}
	
}
