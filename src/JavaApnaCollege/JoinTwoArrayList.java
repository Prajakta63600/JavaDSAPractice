package JavaApnaCollege;

import java.util.ArrayList;

public class JoinTwoArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println("List1: "+list1);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		
		System.out.println("List2: "+list2);
		
		list1.addAll(list2);
		System.out.println("Joined list is :"+list1);

	}

}
