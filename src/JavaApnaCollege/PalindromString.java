package JavaApnaCollege;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check if its palindrom or not");
		String str= sc.next();
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev += str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("String is palindrom");
		}else
		{
			System.out.println("String is not palindrom");
		}

	}

}
