package JavaApnaCollege;

import java.util.Scanner;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		String lowerString = str.toLowerCase();		
		String replaceSpaceStr = lowerString.replace(" ", "");
		System.out.println(replaceSpaceStr);
		
		char[] chars = replaceSpaceStr.toCharArray();
		boolean[] visited = new boolean[chars.length];
		
		for(int i=0; i<chars.length; i++)
		{
			if(visited[i])
			{
				continue;
			}
		
		
		int count = 1;
		for(int j=i+1; j<chars.length; j++)
		{
			if(chars[i]==chars[j])
			{
				count++;
				visited[j] = true;
			}
		}
		
		
		if(count>1)
		{
			System.out.println(chars[i]+" :" +count);
		}
		}

	}

}
