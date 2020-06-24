import java.util.Scanner;

/**
 * State capitals quiz; 10 questions, but pulls randomly
 * from all 50 states while preventing repeats. Also includes
 * a cheat sheet if you answer "CHEATSHEET" (must be all caps).
 * 
 * @author Stephen Lovell
 *<p>Created: 24 Jun 2020</p>
 */
public class Exercise_8_37_OverachieverEdition
{
	
	public static void main(String[] args)
	{
		final int NUMBER_OF_QUESTIONS = 10;
		final String[] STATES = {
				"Alabama",
				"Alaska",
				"Arizona",
				"Arkansas",
				"California",
				"Colorado",
				"Connecticut",
				"Delaware",
				"Florida",
				"Georgia",
				"Hawaii",
				"Idaho",
				"Illinois",
				"Indiana",
				"Iowa",
				"Kansas",
				"Kentucky",
				"Louisiana",
				"Maine",
				"Maryland",
				"Massachusetts",
				"Michigan",
				"Minnesota",
				"Mississippi",
				"Missouri",
				"Montana",
				"Nebraska",
				"Nevada",
				"New Hampshire",
				"New Jersey",
				"New Mexico",
				"New York",
				"North Carolina",
				"North Dakota",
				"Ohio",
				"Oklahoma",
				"Oregon",
				"Pennsylvania",
				"Rhode Island",
				"South Carolina",
				"South Dakota",
				"Tennesee",
				"Texas",
				"Utah",
				"Vermont",
				"Virginia",
				"Washington",
				"West Virginia",
				"Wisconsin",
				"Wyoming"};
		
		final String[] CAPITALS = {
				"Montgomery",
				"Juneau",
				"Phoenix",
				"Little Rock",
				"Sacramento",
				"Denver",
				"Hartford",
				"Dover",
				"Tallahassee",
				"Atlanta",
				"Honolulu",
				"Boise",
				"Springfield",
				"Indianapolis",
				"Des Moines",
				"Topeka",
				"Frankfort",
				"Baton Rouge",
				"Augusta",
				"Annapolis",
				"Boston",
				"Lansing",
				"Saint Paul",
				"Jackson",
				"Jefferson City",
				"Helena",
				"Lincoln",
				"Carson City",
				"Concord",
				"Trenton",
				"Santa Fe",
				"Albany",
				"Raleigh",
				"Bismarck",
				"Columbus",
				"Oklahoma City",
				"Salem",
				"Harrisburg",
				"Providence",
				"Columbia",
				"Pierre",
				"Nashville",
				"Austin",
				"Salt Lake City",
				"Montpelier",
				"Richmond",
				"Olympia",
				"Charleston",
				"Madison",
				"Cheyenne"};
		
		int score = quiz(NUMBER_OF_QUESTIONS, STATES, CAPITALS);
		while (score < 0)	//if you used the cheat sheet, run it again
		{
			score = quiz(NUMBER_OF_QUESTIONS, STATES, CAPITALS);
		}
		System.out.println("Quiz complete.\nScore: " + score + " / "
				+ NUMBER_OF_QUESTIONS);
		
	}
	
	public static int quiz(int numberOfQuestions, String[] states, String[] capitals)
	{
		int score = 0;
		int[] done = new int[numberOfQuestions];	//states that have been done already
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < numberOfQuestions; i++)
		{
			//generate question
			int questionIndex = generateQuestion(done);
			done[i] = questionIndex;
			String question = states[questionIndex];
			
			//ask question and get answer
			System.out.println("What is the capital of " 
					+ question + "?");
			String answer = input.nextLine();
			
			//check answer (and whether you want the cheat sheet)
			if (answer.equals("CHEATSHEET"))
			{
				printCheatSheet(states, capitals);
				return -1;
			}
				
			else if(answer.equalsIgnoreCase(capitals[questionIndex]))
			{
				System.out.println("Correct.\n");
				score++;
			}
			else
				System.out.println("Incorrect. Correct answer: " 
						+ capitals[questionIndex] + "\n");
		}
		
		return score;
	}
	
	public static int generateQuestion(int[] done)
	{
		int questionIndex = (int)(Math.random() * 50);
		while (contains(done, questionIndex))	//check if has been done
			questionIndex = (int)(Math.random() * 50);
		return questionIndex;
	}
	
	public static boolean contains(int[] done, int key)
	{
		for (int i = 0; i < done.length; i++)
		{
			if (done[i] == key)
				return true;
			else if (done[i] == 0)
				break;
		}
		
		return false;
	}
	
	public static void printCheatSheet(String[] states, String[] capitals)
	{
		for (int i = 0; i < states.length; i++)
		{
			System.out.printf("%15s\t%25s\n", states[i], capitals[i]);
		}
	}
	
}