package JavaApnaCollege;

public class secondLargestNumberInArray {
	
	public static int secondlargest(int[] num)
	{
		int firstLargest, secondlargest;
		
		if(num[0]>num[1])
		{
			firstLargest = num[0];
			secondlargest = num[1];
		}else
		{
			firstLargest = num[1];
			secondlargest = num[0];
			
		}
		
		for(int i =2; i<num.length; i++ )
		{
			if(num[i]>firstLargest)
			{
				secondlargest = firstLargest;
				firstLargest = num[i];
			}else if(num[i]<firstLargest && num[i]>secondlargest)
			{
				secondlargest = num[i];
			}
		}
		return secondlargest;
	}

	public static void main(String[] args) {
		int arr[] = {20, 56, 3, 10, 4};
		System.out.println("Second largest number in array is:"+secondlargest(arr));
		

	}

}
