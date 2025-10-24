package NewBookPrograms;

import java.util.Arrays;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str =" praj jakta ";
		//String removespace =str.trim();
//		String removespace = str.replaceAll(" ", "");
//		System.out.println(removespace);
		
		char[] chars = str.toCharArray();
		String newStr = "";
		for(int i=0; i<chars.length; i++) {
			if((chars[i]!=' ') && (chars[i]!='\t')) {
				newStr = newStr+str.charAt(i);
			}
		}
		System.out.print(newStr);

	}

}
