package JavaApnaCollege;

import java.util.Scanner;

public class demoTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		for(int i= num; i>=1; i-=2)
		{
			int space = (num-i)/2;
			for(int s=0; s<space; s++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
					
			System.out.println();		
					
		}
		
		for(int i=3; i<=num; i+=2)
		{
			int space = (num-i)/2;
			for(int s=0; s<space; s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	

	}

}
