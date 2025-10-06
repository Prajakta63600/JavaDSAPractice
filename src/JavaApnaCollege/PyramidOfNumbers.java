package JavaApnaCollege;

import java.util.Scanner;

public class PyramidOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
//		for(int i=0; i<num; i++)
//		{
//			for(int j=i; j<num-1; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int s=0; s<=i; s++)
//			{
//				System.out.print((i+1)+" ");
//			}
//			System.out.println();
//		}
		
//		for(int i=0; i<num; i++)
//		{
//			for(int j=i; j<num-1; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int s=0; s<=i; s++)
//			{
//				System.out.print((s+1)+" ");
//			}
//			System.out.println();
//		}
		
//		for(int i=0; i<num; i++)
//		{
//			for(int j=i; j<num-1; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int s=0; s<=i; s++)
//			{
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
		
//		int rowCount =1;
//		for(int i=0; i<num; i++)
//		{
//			for(int j=i; j<num-1; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int s=0; s<=i; s++)
//			{
//				System.out.print(s+1);
//			}
//			for(int k=rowCount-1; k>=1; k--)
//			{
//				System.out.print(k);
//			}
//			System.out.println();
//			rowCount++;
//		}
		
//		int rowCount=num;
//		for(int i=0; i<num; i++)
//		{
//			for(int j=0; j<=i; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1; k<=rowCount; k++)
//			{
//				System.out.print(k);
//			}
//			
//			for(int l=rowCount-1; l>=1; l--)
//			{
//				System.out.print(l);
//			}
//			System.out.println();
//			rowCount--;
//		}
		
		int rowCount = 1;
		for(int i=num; i>0; i--)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=i; k<=num; k++)
			{
				System.out.print(k);
			}
			for(int l=num-1; l>=i; l--)
			{
				System.out.print(l);
			}
			System.out.println();
			rowCount++;
		}
		
		

	}

}
