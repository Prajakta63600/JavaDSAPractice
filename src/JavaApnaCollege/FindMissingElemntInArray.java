package JavaApnaCollege;

public class FindMissingElemntInArray {
	public static int sumofNumbers(int num)
	{
		int sum = (num*(num+1))/2;
		return sum;
	}
	
	public static int sumOfElements(int[] arr)
	{
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int n=10;
		int[] a = {3,7,9,4,6,10,1,2,8};
		
		int sumofNumber=sumofNumbers(n);
		
		int sumOfElemnt = sumOfElements(a);
		
		int missingNumber = sumofNumber-sumOfElemnt;
		System.out.println(missingNumber);
		

	}

}
