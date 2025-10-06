package JavaApnaCollege;

import java.util.Scanner;

public class BuildMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size of rows");
		int rows = sc.nextInt();
		System.out.println("Enter a size of cols");
		int cols = sc.nextInt();
		
		int[][] matrix = new int[rows][cols];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
