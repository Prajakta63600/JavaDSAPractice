package JavaApnaCollege;

import java.util.Scanner;

public class tableOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check table");
		int n= sc.nextInt();
		
		for(int i = 1; i<=10; i++)
		{
			System.out.println(i*n);
		}

	}

}
