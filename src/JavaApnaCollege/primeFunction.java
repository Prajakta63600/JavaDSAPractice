package JavaApnaCollege;

import java.util.Scanner;

public class primeFunction {
	public static boolean printPrimeNumber(int n)
	{
		if(n<=1)
		{
			
			return false;
		}
		
	for(int i=2; i<n; i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
	   if(printPrimeNumber(n))
	   {
		   System.out.println(n+" is prime number");
	   }else
	   {
		   System.out.println(n+ " is not prime number");
	   }

	}

}
