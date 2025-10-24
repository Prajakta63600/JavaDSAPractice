package JavaApnaCollege;

import java.util.ArrayList;
import java.util.LinkedList;

public class JoinArrayListAndLinkedList {

	public static void main(String[] args) {
		LinkedList<String> linked = new LinkedList<>();
		linked.add("One");
		linked.add("Two");
		linked.add("Three");
		linked.add("Four");
		linked.add("Five");
		System.out.println("Linked list: "+linked);
		
		ArrayList<String> array = new ArrayList<>();
		array.add("Six");
		array.add("Seven");
		array.add("Eight");
		array.add("Nine");
		System.out.println("Array List: "+array);
		
		linked.addAll(array);
		System.out.println("Joined list: " +linked);

	}

}
