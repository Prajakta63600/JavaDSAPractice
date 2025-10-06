package JavaApnaCollege;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDupliacteElementsFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		mylist.add(4);
		mylist.add(5);
		mylist.add(9);
		mylist.add(4);
		mylist.add(9);
		mylist.add(3);
		mylist.add(5);
		
		HashSet<Integer> set = new HashSet<>(mylist);
		System.out.println(set);

	}

}
