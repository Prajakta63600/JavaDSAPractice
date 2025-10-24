package JavaApnaCollege;

import java.util.LinkedHashSet;

public class DuplicateStringUsingSet {

	public static void main(String[] args) {
		String str = "programming";
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(char ch: str.toCharArray())
		{
			set.add(ch);
		}
		
		StringBuilder sb = new StringBuilder();
		for(char ch : set)
		{
			sb.append(ch);
		}
		
		System.out.println(sb.toString());

	}

}
