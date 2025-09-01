package JavaApnaCollege;

import java.util.Scanner;

public class left_Half_Pyarmid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for n to print left half pyramid");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			//inner loop to print spaces
			for(int j=1; j<=(n-i); j++)
			{
				System.out.print(" ");
			}
			
			//inner loop to print stars
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
