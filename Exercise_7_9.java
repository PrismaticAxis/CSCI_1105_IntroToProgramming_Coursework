import java.util.Scanner;

/**
 * Takes input of 10 numbers, then returns the lowest.
 * 
 * @author Stephen Lovell
 * <p>Created: 19 Jun 2020
 *
 */
public class Exercise_7_9
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers separated by spaces: ");
		double[] list = new double[10];
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextDouble();
		
		System.out.println("The lowest number is: " + min(list));
	}
	
	public static double min(double[] array)
	{
		double min = array[0];
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < min)
				min = array[i];
		}
		
		return min;
	}

}
