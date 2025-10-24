package JavaApnaCollege;

import java.util.LinkedList;

public class LinkedListElementExist {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Prajakta");
		list.add("Poonam");
		list.add("Teju");
		list.add("Rudved");
		
		System.err.println(list);
		
		String str = "Prajakta";
		
		boolean strContains = list.contains(str);
		
		if(strContains)
		{
			System.out.println(list.indexOf(str));	
		}else {
			System.out.println(str +" is not present is list");
		}

	}

}
