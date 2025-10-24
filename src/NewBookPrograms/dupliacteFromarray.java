package NewBookPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class dupliacteFromarray {
	public static void dupliacteElement(int num[]) {
		HashSet<Integer> set = new HashSet<>();
		System.out.print("Duplicate Elements are : ");
		for(int n:num) {
			if(!set.add(n)) {
				System.out.print(n+" ");
			}
		}
	}

	public static void main(String[] args) {
		int[] num= {1,4,3,1,4,5};
		dupliacteElement(num);
		

	}

}
