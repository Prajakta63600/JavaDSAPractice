package JavaApnaCollege;

import java.util.Scanner;

public class SecondLargestInArray {
	public static int secondLargest(int[] input)
	{
		int firstlargest, secondlargest;
		if(input[0]>input[1])
		{
			firstlargest = input[0];
			secondlargest = input[1];
			
		}else
		{
			firstlargest = input[1];
			secondlargest= input[0];
		}
		
		for(int i=2; i<input.length; i++)
		{
			if(input[i]>firstlargest)
			{
				secondlargest=firstlargest;
				firstlargest = input[i];
			}else if(input[i]<firstlargest && input[i]>secondlargest)
			{
				secondlargest = input[i];
			}
			
		}
		return secondlargest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] num = new int[size];
		
		for(int i=0; i<size; i++)
		{
			num[i]=sc.nextInt();
		}
				
		System.out.println(secondLargest(num));
		

	}

}
