package JavaApnaCollege;

import java.util.Scanner;

public class factorialFunction {
	public static void calculateFactorial(int n)
	{
	if(n<0)
	{
		System.out.println("Invalid Number");
		return;
	}
	{
		int fact = 1;
		//loop
		for(int i=n; i>=1; i--)
		{
			fact = fact*i;
		}
		System.out.println(fact);
		return;
	}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		calculateFactorial(n);
		

	}

}
