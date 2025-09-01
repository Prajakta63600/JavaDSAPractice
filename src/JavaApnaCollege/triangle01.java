package JavaApnaCollege;

import java.util.Scanner;

public class triangle01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of n to print 01 triangle");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				int sum =i+j;
				if( sum%2 == 0)
				{
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}
