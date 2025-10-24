package JavaApnaCollege;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.ensureCapacity(20);
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Two");
		
		list.trimToSize();
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		boolean containslist = list.contains("One");
		System.out.println(containslist);
		
		System.out.println(list.indexOf("One"));
		System.out.println(list.lastIndexOf("Two"));
		System.out.println(list.get(3));
		System.out.println("replace: "+list.set(3, "Five"));
		System.out.println("Add: "+list.add("Six"));
		list.add(3, "Four");
		System.out.println("Print List"+list);
		list.remove(3);
		System.out.println("Print List"+list);
		List<String> sublistprint = list.subList(2, 4);
		System.out.println("Print List"+sublistprint);
		list.clear();
		list.isEmpty();
		System.out.println("List is empty: "+list.isEmpty());
		
		
		Object[] arr= list.toArray();
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
