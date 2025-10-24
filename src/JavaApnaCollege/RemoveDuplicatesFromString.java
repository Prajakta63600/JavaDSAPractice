package JavaApnaCollege;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String str = "programming";
		String duplicateStr = "";
		
		char[] chars = str.toCharArray();
		boolean[] duplicate = new boolean[chars.length];
		
		
		
		for(int i=0; i<chars.length; i++)
		{
			boolean isEqual = true;
			for(int j=0; j<i; j++)
			{
				if(chars[i]==chars[j])
				{
					isEqual=false;
					break;
				}
			}
			if(isEqual)
			{
				duplicateStr +=chars[i];
			}
		}
		
		System.out.println(duplicateStr);

	}

}
