package JavaApnaCollege;

import java.util.Scanner;

public class RaisedToPower {
	public static int calculatePowserNumber(int x, int n)
	{
		int sum =1;
		for(int i =1; i<=n; i++)
		{
			sum = sum*x;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x");
		int x = sc.nextInt();
		System.out.println("Enter value of n");
		int n= sc.nextInt();
		
		System.out.println("Total Count of x raised by n is: "+calculatePowserNumber(x, n));

	}

}
