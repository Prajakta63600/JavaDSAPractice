package JavaApnaCollege;

import java.util.Scanner;

public class AverageFunction {
	
	public static double sumAverage(int a, int b, int c)
	{
	return (a+b+c)/3.0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First number");
		int a = sc.nextInt();
		System.out.println("Enter a second number");
		int b= sc.nextInt();
		System.out.println("Enter a third number");
		int c= sc.nextInt();
		
		double avg = sumAverage(a, b, c);
		System.out.println("Average of 3 number is: "+avg);
		
		
		
	

	}

}
