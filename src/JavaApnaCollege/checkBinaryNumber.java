package JavaApnaCollege;

import java.util.Scanner;

public class checkBinaryNumber {
	public static void isBinaryOrNot(int num)
	{
		boolean isBinary = true;
		while(num!=0)
		{
			int temp = num%10;
			if(temp>1)
			{
				isBinary = false;
				break;
			}else
			{
				num = num/10;
			}
		}
		if(isBinary)
		{
			System.out.println("Given number is binary");
		}else
		{
			System.out.println("Given number is not binary");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number");
		int number = sc.nextInt();
		
		isBinaryOrNot(number);

	}

}
