package JavaApnaCollege;

import java.util.Scanner;

public class ArrayString1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of String");
		int name = sc.nextInt();
		
		String[] strname = new String[name];
		
		int tolength = 0;
		for(int i=0; i<name; i++)
		{
			strname[i]=sc.next();
			tolength += strname[i].length();
		}
		
		System.out.println(tolength);

	}

}
