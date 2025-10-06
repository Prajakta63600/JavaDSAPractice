package JavaApnaCollege;

public class SecondLargestNumberArray {
	public static int secondLargest(int arr[])
	{
		int firstLargest, secondLargest;
		if(arr[0]>arr[1])
		{
			firstLargest = arr[0];
			secondLargest = arr[1];
		}else
		{
			firstLargest = arr[1];
			secondLargest = arr[0];
		}
		
		for(int i=2; i<arr.length; i++)
		{
			if(arr[i]>firstLargest)
			{
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}else if(arr[i]>firstLargest && arr[i]<secondLargest)
			{
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		int[] arr = {2, 7, 9, 5, 4};
		
		System.out.println(secondLargest(arr));

	}

}
