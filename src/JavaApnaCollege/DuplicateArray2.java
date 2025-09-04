package JavaApnaCollege;

import java.util.Scanner;

public class DuplicateArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		
		String[] name = new String[size];
		
		System.out.println("Enter a " +size+" names in Array");
		for(int i=0; i<size; i++)
		{
			name[i] = sc.next();
		}
		
		boolean isNotEqual= false;
		for(int i=0; i<size; i++)
		{
			for(int j = i+1; j<size; j++)
			{
				if(name[i].equals(name[j]))
				{
					System.out.println(name[j]);
					isNotEqual = true;
					break;
				}
			}
		}
		
		if(!isNotEqual)
		{
			System.out.println("No Duplicate emelent in array");
		}

	}

}
