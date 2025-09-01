package JavaApnaCollege;

import java.util.*;

public class soild_rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of n and m");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		System.out.println("Print Solid rectangle");
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
