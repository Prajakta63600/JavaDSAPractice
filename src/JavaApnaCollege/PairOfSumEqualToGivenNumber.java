package JavaApnaCollege;

import java.util.Scanner;

public class PairOfSumEqualToGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int[] num = new int[size];
		
		System.out.println("Enter a "+size+" numbers");
		for(int i=0; i<size; i++)
		{
			num[i] = sc.nextInt();
		}
		
		System.out.println("Enter a number to find a sum it from given array");
		int sumNumber = sc.nextInt();
		
		boolean found = false;
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(num[i]+num[j]==sumNumber)
				{
					System.out.println("The pairs are ("+num[i]+","+num[j]+")");
					found=true;
				}
			}
		}
		if(!found)
		{
			System.out.println("No pairs found");
		}

	}

}
