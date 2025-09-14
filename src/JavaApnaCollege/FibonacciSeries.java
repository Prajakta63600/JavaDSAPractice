package JavaApnaCollege;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		int n1=0, n2=1, n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0; i<=num; i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
		
	}

}
