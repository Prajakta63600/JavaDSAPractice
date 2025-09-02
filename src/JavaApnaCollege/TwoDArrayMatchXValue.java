package JavaApnaCollege;

import java.util.Scanner;

public class TwoDArrayMatchXValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter a number columns");
		int cols = sc.nextInt();
		
		int[][] numbers = new int[rows][cols];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.println("Enter a number ["+i+"]["+j+"]");
				numbers[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter a value for x to match from given 2D matrix");
		int x =sc.nextInt();
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				if(numbers[i][j]==x)
				{
					System.out.println("Match found at ("+i+","+j+")");
				}
			}
		}
		
		

	}

}
