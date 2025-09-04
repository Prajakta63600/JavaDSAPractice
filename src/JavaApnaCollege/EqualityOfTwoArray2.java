package JavaApnaCollege;

import java.util.Scanner;

public class EqualityOfTwoArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		
		int[] num1= new int[size];
		int[] num2 = new int[size];
	
		System.out.println("Enter a "+size+" numbers");
		for(int i=0; i<size; i++)
		{
			num1[i] = sc.nextInt();
		}
		
		System.out.println("Enter a "+size+" numbers");
		for(int i=0; i<size; i++)
		{
			num2[i] = sc.nextInt();
		}
		
		boolean isEqual = true;
		if(num1.length == num2.length)
		{
			for(int i=0; i<size; i++)
			{
				if(num1[i] != num2[i])
				{
					isEqual =false;
					break;
				}
			}
		}else
		{
			isEqual=false;
		}
		
		if(isEqual)
		{
			System.out.println("Both array are equal");
		}else
		{
			System.out.println("Both array are not equal");
		}

	}

}
