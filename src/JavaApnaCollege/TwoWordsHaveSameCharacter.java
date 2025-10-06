package JavaApnaCollege;

import java.util.Arrays;

public class TwoWordsHaveSameCharacter {

	public static void main(String[] args) {
		String str1 = "Mother In Law";
		String str2 = "Hitler Woman";
		
		str1 = str1.replaceAll(" ", "").toLowerCase();
		str2 = str2.replaceAll(" ", "").toLowerCase();
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
	
		boolean isEqual = true;
		if(chars1.length == chars2.length)
		{
			Arrays.sort(chars1);
			Arrays.sort(chars2);
			
			chars1.equals(chars2);
		}else
		{
			isEqual = false;
		}
		
		if(isEqual)
		{
			System.out.println("Both string are equal");
		}else
		{
			System.out.println("Both String are not anagram");
		}

	}

}
