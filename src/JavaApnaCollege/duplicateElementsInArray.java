package JavaApnaCollege;

import java.util.Scanner;

public class duplicateElementsInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int[] arrNum = new int[size];
		
		for(int i=0; i<size; i++)
		{
			arrNum[i] = sc.nextInt();
		}
		boolean duplicate = true;
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(arrNum[i]==arrNum[j])
				{
					System.out.println(arrNum[i]);
					break;
				}
			}
		}
	}
}
		
		
		

	


