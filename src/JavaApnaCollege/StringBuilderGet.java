package JavaApnaCollege;

public class StringBuilderGet {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Prajakta");
		//Used to get that character at index level
		System.out.println(sb.charAt(0));
		
		//Used to replace the character at index level
		sb.setCharAt(0, 'R');
		System.out.println(sb);
		
		//Used to delete the character at index level
		sb.delete(0, 1);
		//System.out.println(sb);
		
		sb.insert(0, 'P');
		
		//Used to insert the new value
		sb.insert(0, "Amar");
		System.out.println(sb);
		
		

	}

}
