import java.util.Scanner;

/**
 * <p>Takes 10 numbers and returns how many distinct numbers among
 * them and prints those distinct numbers</p>
 * <p>Example: 1 2 3 2 1 6 3 4 5 2<br>
 * returns<br>
 * 6<br>
 * 1 2 3 6 4 5</p>
 * 
 * @author Stephen Lovell
 *<p>Created: 22 Jun 2020</p>
 */
public class Exercise_7_15
{

	public static void main(String[] args)
	{
		int[] list = new int[11];

		//take input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + (list.length - 1)
				+ " numbers separated by spaces: ");
		for (int i = 0; i < list.length - 1; i++)
			list[i] = input.nextInt();
		
		//eliminate duplicates and print
		int[] uniqueList = eliminateDuplicates(list);
		
		System.out.println("Distinct numbers: "
				+ uniqueList[uniqueList.length - 1]);
		
		System.out.print("Array without duplicates: ");
		for (int i = 0; i < uniqueList[uniqueList.length - 1]; i++)
			System.out.print(uniqueList[i] + " ");
	}
	
	public static int[] eliminateDuplicates(int[] list)
	{
		int[] uniqueList = new int[list.length];
		int count = 0;	//tracks index of first "blank" spot in uniqueList
		
		for (int i = 0; i < list.length; i++)
		{
			if (!(contains(uniqueList, list[i])))
			{
				uniqueList[count] = list[i];
				count++;
			}	
		}
		
		uniqueList[uniqueList.length - 1] = count; 
				
		return uniqueList;
	}
	
	
	
	public static boolean contains(int[] list, int key)
	{
		for (int i = 0; i < list.length; i++)
			if (list[i] == key)
				return true;
		
		return false;
	}
}
