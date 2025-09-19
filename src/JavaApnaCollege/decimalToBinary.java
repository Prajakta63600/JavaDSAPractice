package JavaApnaCollege;

import java.util.Scanner;

public class decimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int copyNum= num;
		String binary = "";
		int rem= 0;
		
		while(num>0)
		{
			rem = num%2;
			binary = rem +binary;
			num = num/2;
			
		}
		System.out.println("Binary number of "+copyNum+" is "+binary);

	}

}
