package JavaApnaCollege;

import java.util.Scanner;

public class removeWhiteSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String with white spaces");
		String str = sc.nextLine();
		
		System.out.println("String with white space is: "+str);
		
		String spaceremoved= str.replace(" ", "");
		
		System.out.println("String without white space is :"+spaceremoved);
	

	}

}
