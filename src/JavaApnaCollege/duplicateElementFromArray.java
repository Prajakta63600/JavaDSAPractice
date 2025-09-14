package JavaApnaCollege;

import java.util.HashSet;

public class duplicateElementFromArray {

	public static void main(String[] args) {
		int arr[] = {2, 4, 6,2, 5, 6};
//		HashSet<Integer> myset = new HashSet<>();
//		myset.add(2);
//		myset.add(3);
//		myset.add(5);
//		myset.add(2);
//		myset.add(6);
//		myset.add(3);
//		System.out.println(myset);
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate emelent is:"+arr[i]);
					break;
				}
			}
		}
	

		
		

	}

}
