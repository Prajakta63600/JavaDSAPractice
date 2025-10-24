package NewBookPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(4);
		set.add(5);
		set.add(4);
		set.add(2);
		System.out.println(set);
		System.out.println("Size:"+set.size());
		
		System.out.println(set.contains(4));
		if(set.contains(5)) {
			System.out.println("Contains 5");
		}
		if(set.contains(6)) {
			System.out.println("Does not conatins 6");
		}
		
		set.add(3);
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + ",");
		}
		System.out.println();
		
	}

}
