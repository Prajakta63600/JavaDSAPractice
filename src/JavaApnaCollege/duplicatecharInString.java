package JavaApnaCollege;

import java.util.Scanner;

public class duplicatecharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		str = str.replace(" ", "");
		System.out.println(str);
		
		//Convert string into character array
		char[] chars = str.toCharArray();
		
		boolean[] visiter = new boolean[chars.length];
		
		for(int i=0; i<chars.length; i++)
		{
			if(visiter[i])
			{
				continue;
			}
			
			int count =1;
			for(int j=i+1; j<chars.length; j++)
			{
				if(chars[i]==chars[j])
				{
					count++;
					visiter[j]=true;
				}
			}
			
			if(count>1)
			{
				System.out.println(chars[i]+" : "+count);
			}
		}
		
		
		
				

	}

}
