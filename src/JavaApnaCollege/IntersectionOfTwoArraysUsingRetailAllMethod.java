package JavaApnaCollege;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArraysUsingRetailAllMethod {

	public static void main(String[] args) {
		String[] str1 = {"One", "Three", "Four", "Six", "Seven"};
		String[] str2 = {"Three", "Four", "Seven", "One", "Eight", "Seven"};
		
		HashSet<String> set1 = new HashSet<String>(Arrays.asList(str1));
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(str2));
		
		set1.retainAll(set2);
		System.out.println(set1);

	}

}
