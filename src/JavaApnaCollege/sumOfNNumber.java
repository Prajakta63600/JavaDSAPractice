package JavaApnaCollege;

import java.util.Scanner;

public class sumOfNNumber {

	public static void main(String[] args) {
//		int n=5;
//		int sum =0;
//		
//		for(int i =0; i<=n; i++)
//		{
//			sum = sum+i;
//		}
//		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in );
		System.out.println("Enter a number to calculate sum");
		int n= sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);

	}

}
