package JavaApnaCollege;

import java.util.Scanner;

public class StringBuilderReplaceWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String name = sc.next();
		String result ="";
		
		StringBuilder sb = new StringBuilder(name);
		for(int i=0; i<name.length(); i++)
		{
			if(sb.charAt(i)=='a')
			{
			 sb.setCharAt(i, 'i');
			}else
			{
				sb.charAt(i);
			}
		}
		System.out.println(sb);
	}

}
