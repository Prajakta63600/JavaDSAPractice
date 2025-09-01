package JavaApnaCollege;

import java.util.Scanner;

public class FibonacciFunction {
	public static void fibonacci(int n)
	{
		int m1=0, m2=1, m3;
		System.out.println(m1);
		System.out.println(m2);
		
		for(int i=1; i<=n; i++)
		{
			m3= m1+m2;
			m1=m2;
			m2=m3;
			System.out.println(m3);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		
		System.out.println("Fibonacci series");
		
		fibonacci(n);

	}

}
