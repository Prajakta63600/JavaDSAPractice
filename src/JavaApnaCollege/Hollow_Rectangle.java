package JavaApnaCollege;

import java.util.Scanner;

public class Hollow_Rectangle {

	public static void main(String[] args) {
//		int n=4;
//		int m=5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value or n and m to print a hollow rectangle");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				if(i==1 || j==1 || i==n || j==m)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
