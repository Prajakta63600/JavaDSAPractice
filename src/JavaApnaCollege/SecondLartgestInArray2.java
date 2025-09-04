package JavaApnaCollege;

import java.util.Scanner;

public class SecondLartgestInArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter aSize of array");
		int size = sc.nextInt();
		
		int[] num = new int[size];
		
		System.out.println("Enter a "+size+" numbers");
		for(int i=0; i<size; i++)
		{
			num[i] = sc.nextInt();
		}
		
		int firstLarge , secondLarge;
		
		if(num[0]>num[1])
		{
			firstLarge = num[0];
			secondLarge = num[1];
		}else
		{
			firstLarge = num[1];
			secondLarge = num[0];
		}
		
		for(int i=2; i<size; i++)
		{
			if(num[i]>firstLarge)
			{
				secondLarge=firstLarge;
				firstLarge = num[i];
			}else if( num[i]>firstLarge && num[i]<secondLarge)
			{
				secondLarge = num[i];
			}
		}
		System.out.println(secondLarge);
	}

}
