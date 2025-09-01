package JavaApnaCollege;

import java.util.Scanner;

public class studentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Enter 1 to check students marks or enter 0 to exit");
			choice = sc.nextInt();
			
			if(choice ==1)
			{
				System.out.println("Enter a student marks from (0-100)");
				int marks = sc.nextInt();
				
				if(marks>=90 && marks<=100)
				{
					System.out.println("This is Good");
				}else if(marks>=60 && marks<=89)
				{
					System.out.println("This is also good");
				}else if (marks>=0 && marks<=59)
				{
					System.out.println("This is good as well");
				}else
				{
					System.out.println("Invalid student marks, enter a marks from 0 to 100");
				}
			}else if(choice ==0)
			{
				System.out.println("Exit from code,");
			}
		}while(choice !=0);
			System.out.println("Program ended");
		sc.close();

	}

}
