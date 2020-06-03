/*
 Author:	Stephen Lovell
 Date:		03 Jun 2020
 
 Solves a specific system of two equations
 using Cramer's Rule.
*/

public class Cramer 
{
	public static void main(String[] args)
	{
		System.out.print("x = ");
		System.out.println((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1));
		System.out.print("y = ");
		System.out.println((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1));
	}
}
