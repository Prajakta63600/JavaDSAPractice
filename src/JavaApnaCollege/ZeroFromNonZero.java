package JavaApnaCollege;

import java.util.Scanner;

public class ZeroFromNonZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		
		int[] num = new int[size];
		
		for(int i=0; i<size; i++)
		{
			num[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<size; i++)
		{
			if(num[i]==0)
			{
				System.out.println("zeros in array are: "+num[i]);
				break;
			}
		}

	}

}
