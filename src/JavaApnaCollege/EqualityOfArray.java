package JavaApnaCollege;

public class EqualityOfArray {

	public static void main(String[] args) {
		int arr1[] = {3, 5, 7, 8, 1}; 
		int arr2[] = {3, 5, 7, 8, 1}; 
		
		boolean equalOrNot = true;
		if(arr1.length==arr2.length)
		{
		
			for(int i =0; i<arr1.length; i++)
			{
				if(arr1[i] != arr2[i])
				{
					equalOrNot = false;
				}
			}
		}else
		{
			equalOrNot = false;
		}
		
		if(equalOrNot)
		{
			System.out.println("Both array are equal");
		}else
		{
			System.out.println("Both array are not equal");
		}

	}

}
