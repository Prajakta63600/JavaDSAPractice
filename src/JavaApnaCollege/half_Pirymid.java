package JavaApnaCollege;

import java.util.Scanner;

public class half_Pirymid {

	public static void main(String[] args) {
		//int n=4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n to print a half pirymid");
		int n = sc.nextInt();
		
		//outer loop
		for(int i=1; i<=n; i++)
		{
			//inner loop
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
