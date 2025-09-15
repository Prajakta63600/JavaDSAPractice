package JavaApnaCollege;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		double sum =0;
		int orignalNum = num;
		int n = String.valueOf(num).length();
		
		while(num>0)
		{
			int digit = num%10;
			sum = sum + Math.pow(digit, n);
			num = num/10;
		}
		
		if(sum == orignalNum)
		{
			System.out.println("Given number is armStrong");
		}else
		{
			System.out.println("Given number is not a armstrong number");
		}
		

	}

}
