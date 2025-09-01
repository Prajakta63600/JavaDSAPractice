package JavaApnaCollege;

import java.util.Scanner;

public class StringNameArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		String name[] = new String[size];
		
		System.out.println("Enter "+size+" name");
		for(int i=0; i<size; i++)
		{
			name[i]= sc.next();
			
		}
		
		for(int i=0; i<=name.length; i++)
		{
			System.out.println(name[i]);
		}

	}

}
