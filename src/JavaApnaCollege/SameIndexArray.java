package JavaApnaCollege;

import java.util.Scanner;

public class SameIndexArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size of array");
		int size = sc.nextInt();
		int number[] = new int[size];
		
		System.out.println("Enter "+size+" values");
		for(int i=0; i<size; i++)
		{
			
			number[i] = sc.nextInt();
		}
		
		System.out.println("Enter a value x to match the value");
		int x = sc.nextInt();
		
		for(int i=0; i<number.length; i++)
		{
			if(number[i]==x)
			{
				System.out.println("Matching value of x index is: "+i);
			}
		}

	}

}
