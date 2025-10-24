package JavaApnaCollege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name");
		String str = sc.nextLine();
		
		String[] split= str.split(" ");
		
		System.out.println(Arrays.toString(split));
		
		StringBuilder intials = new StringBuilder();
		for(int i=0; i< split.length; i++)
		{
			intials.append(split[i].substring(0, 1).toUpperCase()).append(" ");
		}
		
		System.out.println(intials.toString());
		String first = split[0].substring(0, 1);
		String first1 = split[1].substring(0, 1);
		
		System.out.println(first+" "+first1);

	}

}
