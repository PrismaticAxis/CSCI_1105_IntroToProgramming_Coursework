import java.util.Scanner;

/**
 * 
 * @author Stephen Lovell
 *<p>Created: 24 Jun 2020</p>
 */
public class Exercise_8_9
{

	public static void main(String[] args)
	{
		int turn = 1;
		char activePlayer;
		String[][] board = new String[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				board[i][j] = "   ";
		
		Scanner input = new Scanner(System.in);
		
		while (turn < 10)
		{
			drawBoard(board);
			//determine whose turn it is
			if (turn % 2 == 1)
				activePlayer = 'X';
			else
				activePlayer = 'O';
			
			//get input
			System.out.println("Enter row and column for player "
					+ activePlayer + ": ");
			int row = input.nextInt();
			int col = input.nextInt();
			
			//check for valid input
			if (row < 0 || row > 2 || col < 0 || col > 2)
			{
				System.out.println("Invalid input.");
				continue;
			}
			//check if space is empty
			else if (!(board[row][col] == "   "))
			{
				System.out.println("Invalid move. Try another space.");
				continue;
			}
			else
			{
				board[row][col] = " " + activePlayer + " ";
			}
			
			turn++;
		}
		
		drawBoard(board);		
	}
	
	public static void drawBoard(String[][] board)
	{
		String header = "       0   1   2";
		String rowBorder = "     -------------";
		
		System.out.println(header);
		for (int i = 0; i < 3; i++)
		{
			System.out.println(rowBorder);
			drawRow(i, board[i]);
		}
		System.out.println(rowBorder);	
	}
	
	public static void drawRow(int n, String[] row)
	{
		System.out.print("  " + n + "  ");
		for (int i = 0; i < 3; i++)
			System.out.print("|" + row[i]);
		System.out.println("|");
	}

}
