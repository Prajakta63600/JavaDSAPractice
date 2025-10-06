package JavaApnaCollege;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {2,6,8,0,7};
		int[] arr2= {2,6,8,0,7};
		boolean isEqual = true;
		if(arr1.length==arr2.length)
		{
			for(int i=0; i<arr1.length; i++)
			if(arr1[i]!=arr2[i])
			{
				isEqual = false;
				break;
			}
		}else
		{
			isEqual = false;
		}
		
		if(isEqual)
		{
			System.out.println("Both array are equal");
		}else
		{
			System.out.println("Both array are not equal");
		}

	}

}
