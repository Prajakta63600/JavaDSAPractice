package JavaApnaCollege;

import java.util.Arrays;

public class anagramProgram {

	public static void main(String[] args) {
		String str1 = "Mother In Law";
		String str2 = "Hitler Woman";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");
		
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		
		boolean status = true;
		if(chars1.length == chars2.length)
		{
			Arrays.sort(chars1);
			Arrays.sort(chars2);
			
			chars1.equals(chars2);
		}else
		{
			status = false;
		}
		
		if(status)
		{
			System.out.println("Anagram String");
		}else
		{
			System.out.println("Not a anagram String");
		}
			

	}

}
