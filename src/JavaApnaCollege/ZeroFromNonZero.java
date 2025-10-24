package JavaApnaCollege;

import java.util.Arrays;
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
		
		int pos = 0;
		
		for(int i=0; i<size; i++)
		{
			if(num[i]>0)
			{
				num[pos]= num[i];
				pos++;
			}
		}
		
		if(pos<num.length) {
			for(int i=pos; i<num.length; i++)
			{
				num[i] = 0;
			}
			System.out.println(Arrays.toString(num));
		}

	}

}
