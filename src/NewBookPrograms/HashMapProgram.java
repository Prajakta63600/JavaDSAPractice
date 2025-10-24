package NewBookPrograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Prajakta", 1);
		map.put("Roopa", 2);
		map.put("Renuka", 5);
		map.put("Amar", 3);
		
		System.out.println(map);
		System.out.println("Size "+map.size());
		System.out.println(map.containsKey("Roopa"));
		System.out.println(map.containsValue(5));
		
		System.out.println(map.get("Amar"));
		
		for(Map.Entry<String, Integer> e: map.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		map.remove("Amar");
		System.out.println(map);

	}

}
