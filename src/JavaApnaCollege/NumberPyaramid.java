package JavaApnaCollege;

import java.util.Scanner;

public class NumberPyaramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		for(int i = 0; i<num; i++)
		{
			for(int s=num-1; s>=i; s--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print(i+1+" ");
			}
				System.out.println();	
		}

	}

}
