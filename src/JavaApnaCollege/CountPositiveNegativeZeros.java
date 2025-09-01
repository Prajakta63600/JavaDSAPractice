package JavaApnaCollege;

import java.util.Scanner;

public class CountPositiveNegativeZeros {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int positive=0;
		int negative=0;
		int choice;
		int zero=0;
		do {
			System.out.println("Enter a Numeber");
			int n = sc.nextInt();
			
			if(n>0)
			{
				 positive++;
			}else if(n<0)
			{
				negative++;
			}else
			{
				zero++;
			}
			
			System.out.println("Do you still want to enter a number? (Y/N): ");
		    choice = sc.next().charAt(0);
		}while(choice== 'y' || choice == 'Y');
		{
			System.out.println("Count of Postive numbers: "+positive);
			System.out.println("Count of Negative numbers: "+negative);
			System.out.println("Count of zero numbers: "+zero);
		}

	}

}
