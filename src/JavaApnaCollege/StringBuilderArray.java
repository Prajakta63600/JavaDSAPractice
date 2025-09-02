package JavaApnaCollege;

import java.util.Scanner;

public class StringBuilderArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt()
				;
		String[] strname = new String[size];
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<strname.length; i++)
		{
			 strname[i] = sc.next();
			 sb.append(strname[i]);
					
		}
		
		int tolength = sb.length();
		System.out.println(sb.toString());
		System.out.println(tolength);
		

	}

}
