package JavaApnaCollege;

import java.util.Scanner;

public class solid_Rohmbus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of n to print Solid Rohmbus");
		int n = sc.nextInt();
		int m=5;
		
		for(int i=1; i<=n; i++ )
		{
			//inner loop for spaces
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			//inner loop for printing stars
			for(int j=1; j<=m; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
				

	}

}
