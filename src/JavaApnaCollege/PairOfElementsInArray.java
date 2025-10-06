package JavaApnaCollege;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PairOfElementsInArray {
	public static void pairOfElement(int arr[], int n)
	{
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length-1;
		
		while(i<j)
		{
			if(arr[i]+arr[j]==n)
			{
				System.out.println("Sum of 2 pairs in array are "+arr[i]+" + "+arr[j]+" = "+n );
				i++;
				j--;
			}else if(arr[i]+arr[j]>n)
			{
				j--;
			}else if(arr[i]+arr[j]<n)
			{
				i++;
			}
		}
	}

	public static void main(String[] args) {
		pairOfElement(new int[] {10,7,5,30,13,15},20 );
		//{5,7,10,13,15,30}

	}

}
