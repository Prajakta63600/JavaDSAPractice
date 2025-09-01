package JavaApnaCollege;

import java.util.Scanner;

public class MaxMinInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size =sc.nextInt();
		int integer[] = new int[size];
		
		System.out.println("Enter "+size+" value");
		for(int i=0; i<size; i++)
		{
			integer[i]=sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
	
		for(int i=0; i<integer.length; i++)
		{
			if(integer[i]>max)
			{
				max=integer[i];	
			}
		
			
			
			if(integer[i]<min)
			{
				min = integer[i];
			}
			
		}
		System.out.println("Maximum number is: "+max);
		System.out.println("Minimum number is: "+min);

	}

}
