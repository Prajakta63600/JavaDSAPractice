package JavaApnaCollege;

public class SelectionSort {
	public static void printArray(int[] inputArray)
	{
		for(int i=0; i<inputArray.length; i++)
		{
			System.out.println(inputArray[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr= {3, 6, 8, 2, 0, 7};
		int temp, pos;
		
		for(int i=0; i<arr.length; i++)
		{
			pos=i;
			
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[pos])
				{
					pos=j; //3, 4
				}
			}
			
			temp=arr[i];//3
			arr[i] = arr[pos];
			arr[pos]=temp;
		}

		printArray(arr);
	}
	

}
