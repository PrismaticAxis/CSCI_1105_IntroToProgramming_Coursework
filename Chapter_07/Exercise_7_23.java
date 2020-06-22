/**
 *  
 * @author Stephen Lovell
 * <p>Created: 22 Jun 2020</p>
 *
 */
public class Exercise_7_23
{
	
	public static void main(String[] args)
	{
		boolean[] lockers = new boolean[100];
		
		/*	first few iterations for the sake of figuring out the pattern
			for (int i = 0; i < lockers.length; i++)
				lockers[i] = openClose(lockers[i]);
		
			for (int i = 1; i < lockers.length; i = i + 2)
				lockers[i] = openClose(lockers[i]);
		
			for (int i = 2; i < lockers.length; i = i + 3)
				lockers[i] = openClose(lockers[i]);
		*/
		for (int j = 0; j < lockers.length; j++)
		{
			for (int i = j; i < lockers.length; i = i + j + 1)
				lockers[i] = openClose(lockers[i]);
		}
		
		//print results
		System.out.print("Open lockers: ");
		for (int i = 0; i < lockers.length; i++)
		{
			if (lockers[i])
				System.out.print("L" + (i + 1) + "  ");	//0 corresponds to L1, 1 to L2, etc.
		}
	}
	
	public static boolean openClose(boolean L)
	{
		if (L)
			return false;
		else
			return true;
	}
}
