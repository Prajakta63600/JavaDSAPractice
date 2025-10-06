package JavaApnaCollege;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateInArray {

	public static void main(String[] args) {
		int[] arr = {4, 7, 8, 7, 4, 2};
		
		System.out.println("Duplicate Element is array are");
		boolean isEqual = true;
		for(int i=0; i<=arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]!=arr[j])
				{
					isEqual = false;
				}else
				{
					isEqual = true;
					System.out.println(arr[i]);
					break;
				}
			}
		}
	
		

	}

}
