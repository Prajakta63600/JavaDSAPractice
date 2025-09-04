package JavaApnaCollege;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size of array");
		int size = sc.nextInt();
		int[] num = new int[size];
		
		for(int i =0; i<size; i++)
		{
			num[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(num[i]==num[j])
				{
					System.out.println("Duplicate element is:"+num[i]);
					break;
				}
				
			}
		}

	}

}
