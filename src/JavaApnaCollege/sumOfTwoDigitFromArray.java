package JavaApnaCollege;

import java.util.Scanner;

public class sumOfTwoDigitFromArray {
	public static void sumOfTwoDigit(int[] num1, int givenNum)
	{
		for(int i=0; i<num1.length; i++)
		{
			for(int j=i+1; j<num1.length; j++)
			{
				if(num1[i]+num1[j]==givenNum)
				{
					System.out.println(num1[i]+" + "+num1[j]+" = "+givenNum);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num to calculate sum from array");
		int sumNum =sc.nextInt();
		
		System.out.println("Enter asize of array");
		int size = sc.nextInt();
		
		int[] num = new int[size];
		
		for(int i=0; i<size; i++)
		{
			num[i] = sc.nextInt();
		}
		sumOfTwoDigit(num, sumNum);
		

	}

}
