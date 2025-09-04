package JavaApnaCollege;

import java.util.Arrays;
import java.util.Scanner;

public class equalityOfTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size1 = sc.nextInt();
		//int size2 = sc.nextInt();
		
		int[] num1 = new int[size1];
		int[] num2 = new int[size1];
		
		for(int i=0; i<size1; i++)
		{
			num1[i] = sc.nextInt();
		}
		
		boolean isEqual = true;
		for(int i=0; i<size1; i++)
		{
			num2[i] =sc.nextInt();
		}
//			if(num1.length == num2.length)
//			{
//				for(int i=0; i<size1; i++)
//				{
//					if(num1[i] != num2[i])
//					{
//						isEqual = false;
//						break;
//					}
//					
//				}
//			}else
//			{
//				
//				isEqual = false;
//			}
//			
//			if(isEqual)
//			{
//				System.out.println("Array is equal");
//			}else
//			{
//				System.out.println("Arrys is not equal");
//			}
			
			System.out.println(Arrays.equals(num1, num2));

	}

}
