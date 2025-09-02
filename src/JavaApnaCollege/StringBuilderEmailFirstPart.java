package JavaApnaCollege;

import java.util.Scanner;

public class StringBuilderEmailFirstPart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String email = sc.next();
		
		StringBuilder sb = new StringBuilder(email);
		for(int i=0; i<email.length(); i++)
		{
			if(sb.charAt(i)=='@')
			{
				sb.delete(i, sb.length());
				break;
			}else
			{
				sb.charAt(i);
			}
		}
		System.out.println(sb);

	}

}
