package NewBookPrograms;

import java.util.HashSet;

public class IntersectionOfArray {
	public static int intersection(int[] arr1, int[] arr2) {
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		int count =0;
		for(int j=0; j<arr2.length; j++) {
			if(set.contains(arr2[j])) {
				count++;
				set.remove(arr2[j]);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 4, 2 , 3, 4};
		int[] arr2= {4, 6, 2, 7, 5, 8, 3};
		
		System.out.println(intersection(arr1, arr2));

	}

}
