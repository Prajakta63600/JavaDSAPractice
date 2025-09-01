package JavaApnaCollege;

import java.util.Scanner;

public class palindromic_Number_Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of n to print plaindrom number pyramid");
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			//inner loop to print spaces
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			//inner loop to print decreasing number
			for(int j=i; j>=1; j--)
			{
				System.out.print(j + " ");
			}
			//inner loop to print increasing number (start from 2 to avoid duplicate "1")
			for(int j=2; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
