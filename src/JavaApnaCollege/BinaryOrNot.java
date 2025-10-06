package JavaApnaCollege;

import java.util.Scanner;

public class BinaryOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isBinary = true;
		while(num>0)
		{
			num = num%10;
			
			if(num>1)
			{
				isBinary = false;
				break;
			}else
			{
				num =num/10;
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

}
