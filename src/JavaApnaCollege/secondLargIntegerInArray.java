package JavaApnaCollege;

import java.util.Scanner;

public class secondLargIntegerInArray {
	public static void secondLarge(int[] num)
	{
		int firstlargest, secondlargest;
		
		if(num[0]>num[1])
		{
			firstlargest = num[0];
			secondlargest = num[1];
		}else
		{
			firstlargest = num[1];
			secondlargest = num[0];
		}
		
		for(int i=2; i<num.length; i++)
		{
			if(num[i]>firstlargest)
			{
				secondlargest = firstlargest;
				firstlargest = num[i];
			}else if(num[i]>firstlargest && num[i]<secondlargest)
			{
				secondlargest = num[i];
			}
		}
		System.out.println(secondlargest);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		
		int[] number = new int[size];
		
		for(int i=0; i<size; i++)
		{
			number[i]=sc.nextInt();
		}
		
		secondLarge(number);

	}

}
