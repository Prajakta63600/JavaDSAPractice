package JavaApnaCollege;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseElementInLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		System.out.println(list);
		
		Iterator<String> it = list.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+",");
		}
		

	}

}
