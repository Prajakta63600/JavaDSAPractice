package JavaApnaCollege;

import java.util.Arrays;

public class LeadersInIntegerArray {

	public static void main(String[] args) {
		int[] arr = {12, 9, 7, 14, 8, 6, 3};
		int arrLength = arr.length;
		int max =arr[arrLength-1];
		
		//printing last element because its alwyas a leader
		System.out.println(arr[arrLength-1]);
		
		for(int i=arr.length-2; i>=0; i--)
		{
			if(arr[i]>max)
			{
				System.out.println(arr[i]);
				
				max = arr[i];
			}

		}

	}

}
