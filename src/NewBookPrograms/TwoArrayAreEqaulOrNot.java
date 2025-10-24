package NewBookPrograms;

public class TwoArrayAreEqaulOrNot {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {1,2,3,4,5,6};
		boolean isEqual = true;
		if(arr1.length!=arr2.length) {
			System.out.println("Both arrays are not equal");
		}else {
			for(int i=0; i<arr1.length; i++) {
					if(arr1[i]!=arr2[i]) {
						isEqual=false;
						break;
					}
			
			}
			if(isEqual) {
				System.out.println("Both arrays are equal");
			}else
			{
				System.out.println("Both arrays are not equal");
			}
		}

	}

}
