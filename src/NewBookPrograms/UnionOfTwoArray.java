package NewBookPrograms;

import java.util.HashSet;

public class UnionOfTwoArray {
	public static int union(int arr1[], int arr2[]) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		
		for(int j=0; j<arr2.length; j++) {
			set.add(arr2[j]);
		}
		
		return set.size();
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 4, 2 , 3, 4};
		int[] arr2= {4, 6, 2, 7, 5, 8};
		
		System.out.println(union(arr1, arr2));
		

	}

}
