package JavaApnaCollege;

import java.util.Scanner;

public class countCharacterInString {
	public static void countCharacter(String str)
	{
		str = str.replace(" ", "").toLowerCase();
		
		char[] chars = str.toCharArray();
		boolean[] visited = new boolean[chars.length];
		for(int i=0; i<chars.length; i++)
		{
			if(visited[i])
			{
				continue;
			}
			int count=1;
			for(int j=i+1; j<chars.length; j++)
			{
				if(chars[i]==chars[j])
				{
					count++;
					visited[j] = true;
				}
			}
			if(count>0) {
				System.out.println(chars[i]+" : "+count);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a String");
		String name = sc.nextLine();
				
		countCharacter(name);

	}

}
