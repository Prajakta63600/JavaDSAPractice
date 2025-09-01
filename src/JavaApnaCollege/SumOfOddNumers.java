package JavaApnaCollege;

import java.util.Scanner;

public class SumOfOddNumers {
	public static void sumOffOdd(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
		if(i%2!=0)
		{
			sum=sum+i; 
		}
		}
		System.out.println("Sum off all odd numbers till " +n+ " number "+ sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		sumOffOdd(n);

	}

}
