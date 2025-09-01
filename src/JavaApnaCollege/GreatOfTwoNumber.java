package JavaApnaCollege;

import java.util.Scanner;

public class GreatOfTwoNumber {
	public static int printGreatestOfTwoNumber(int a, int b)
	{
		if(a>b)
		{
			return a;
		}else
		{
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value to check greatest number");
		int x = sc.nextInt();
		System.out.println("Enter a value to check greatest number");
		int y = sc.nextInt();
		
		System.out.println("The greatest number is: "+printGreatestOfTwoNumber(x, y));

	}

}
