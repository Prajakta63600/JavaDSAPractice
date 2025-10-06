package JavaApnaCollege;

import java.util.ArrayList;
import java.util.HashSet;

public class duplicateElementFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<>();
		mylist.add("Java");
		mylist.add("Selenium");
		mylist.add("Selenium");
		mylist.add("Maven");
		mylist.add("Java");
		mylist.add("TestNG");
		mylist.add("Manual Testing");
		
		System.out.println("ArrayLits before removing duplicate elements: \n"+mylist);
		
		HashSet<String> set = new HashSet<String>(mylist);
		
		System.out.println(set);
		
		ArrayList<String> Noduplictae = new ArrayList<String>(set);
		
		System.out.println("ArrayList without duplicate element: \n"+Noduplictae);
		
		

	}

}
