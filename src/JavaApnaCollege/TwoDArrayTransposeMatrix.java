package JavaApnaCollege;

import java.util.Scanner;

public class TwoDArrayTransposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row value");
		int rows = sc.nextInt();
		
		System.out.println("Enter a column value");
		int cols = sc.nextInt();
		
		int[][] num = new int[rows][cols];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
		
		for(int j=0; j<cols; j++)
		{
			for(int i=0; i<rows; i++)
			{
				System.out.print(num[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
