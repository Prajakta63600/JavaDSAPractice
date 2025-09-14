package JavaApnaCollege;

import java.util.Scanner;

public class reverseStringAgain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev += str.charAt(i); 
		}
		System.out.println(rev);
		

	}

}
