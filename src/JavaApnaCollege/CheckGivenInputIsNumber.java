package JavaApnaCollege;

import java.util.Scanner;

public class CheckGivenInputIsNumber {
	public static boolean numberOrNot(String input)
	{
		try
		{
			Integer.parseInt(input);
		}catch(NumberFormatException ex){
			return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		System.out.println("Enter a Your Mobile Number");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		if(CheckGivenInputIsNumber.numberOrNot(num) && num.length()==10)
		{
			System.out.println("You have entered correct number");
		}else
		{
			System.out.println("Entered number is incorrect");
		}

		

	}

}
