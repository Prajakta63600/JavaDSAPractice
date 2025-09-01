package JavaApnaCollege;

import java.util.Scanner;

public class AgeFunction {
	public static boolean eligebleToVote(int n)
	{
		if(n>=18)
		{
			return true;
		}else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a number to check if user is eligable to vote or not");
		int x = sc.nextInt();
		
		System.out.println(eligebleToVote(x));

	}

}
