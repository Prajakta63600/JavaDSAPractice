package JavaApnaCollege;

public class countString {

	public static void main(String[] args) {
		String str = "ttessst@innn123ggg!";
		int count = 0;
		
		char[] chars = str.toCharArray();
		boolean[] visisted = new boolean[chars.length];
		
		for(int i=0; i<chars.length; i++)
		{
			count++;
		}
		System.out.println(count);

	}

}
