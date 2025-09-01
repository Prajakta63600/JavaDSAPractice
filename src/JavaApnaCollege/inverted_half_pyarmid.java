package JavaApnaCollege;

import java.util.Scanner;

public class inverted_half_pyarmid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of n to print a inverted half pyramid");
		int n= sc.nextInt();
		
		for(int i=n; i>0; i--)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
				
			}
             System.out.println();
		}

	}

}
