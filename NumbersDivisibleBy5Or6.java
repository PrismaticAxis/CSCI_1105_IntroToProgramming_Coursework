
public class NumbersDivisibleBy5Or6
{

	public static void main(String[] args)
	{
		final int START_NUMBER = 100;
		final int END_NUMBER = 200;
		final int NUMBERS_PER_LINE = 10;
		int count = 1;
				
		//determine whether divisible by 5 or 6 exclusive
		for (int number = START_NUMBER; number <= END_NUMBER; number++)
		{
			if (number % 5 == 0 ^ number % 6 == 0)
			{
				//print, followed by either tab or line break as appropriate
				if (count % NUMBERS_PER_LINE == 0)
					System.out.println(number);
				else
					System.out.print(number + "\t");
				count++;
			}
		}
	}
	
}
