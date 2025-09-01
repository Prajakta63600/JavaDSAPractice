package JavaApnaCollege;

import java.util.Scanner;

public class butterfly_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of n to print butterfly");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			//inner loop to print first pyramid
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			//inner loop to print middle spaces
			for(int j=1; j<=2*(n-i); j++)
			{
				System.out.print(" ");
			}
			//inner loop to print second pyramid
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int j=1; j<=2*(n-i); j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
