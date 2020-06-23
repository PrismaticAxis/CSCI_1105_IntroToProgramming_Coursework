import java.util.Scanner;

/**
 * 
 * @author Stephen Lovell
 *<p>Created: 23 Jun 2020</p>
 */
public class Exercise_8_5
{
	
	public static void main(String[] args)
	{
		/* original test values
		double[][] a =
			{{1.0, 2.0, 3.0},
				{4.0, 5.0, 6.0},
				{7.0, 8.0, 9.0}
			};
		double[][] b =
			{{0.0, 2.0, 4.0},
				{1.0, 4.5, 2.2},
				{1.1, 4.3, 5.2}
			};
		*/
		
		//get input
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter matrix 1: ");
		for (int i = 0; i < 3; i++)				//could add functionality
			for (int j = 0; j < 3; j++)			//for handling different
				a[i][j] = input.nextDouble();	//sized matrices later
		
		System.out.print("Enter matrix 2: ");
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				b[i][j] = input.nextDouble();
		
		//sum and print results
		System.out.println("The sum of the matrices is:");
		printMatrix(addMatrix(a,b));
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		double[][] sum = new double[a.length][a[0].length];
		
		/*
		 * Right now, program can only handle 3-by-3 matrices,
		 * but this could be useful for filtering out invalid
		 * input after adding functionality that allows for
		 * different sized matrices.
		 */
		if (!(a.length == b.length && a[0].length == b[0].length))
		{
			System.out.println("Invalid input. Matrices must be of equal dimensions.");
			return sum;
		}
		
		for (int j = 0; j < a.length; j++)
			for (int i = 0; i < a[j].length; i++)	//each iteration adds one row
				sum[j][i] = a[j][i] + b[j][i];
		
		return sum;
	}
	
	public static void printMatrix(double[][] m)
	{
		for (int i = 0; i < m.length; i++)
		{
			printRow(m[i]);
		}
	}
	
	public static void printRow(double[] x)
	{		
		System.out.print("[ ");
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + "\t");
		System.out.println("]");
	}
}