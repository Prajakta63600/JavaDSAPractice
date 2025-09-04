package JavaApnaCollege;

import java.util.Scanner;

public class IntersectionArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		
		String[] str1= new String[size];
		String[] str2 = new String[size];
		
		for(int i=0; i<size; i++)
		{
			str1[i] = sc.next();
		
		}
		
		for(int i=0; i<size; i++)
		{
			str2[i] = sc.next();
		}
		
		boolean isEqual = false;
		if(str1.length == str2.length)
		{
			for(int i=0; i<size; i++)
			{
				for(int j=0; j<size; j++)
				{
					if(str1[i].equals(str2[j]))
					{
					  isEqual = true;
					  System.out.println(str1[i]);
					}
				}
			}
			}else
			{
				isEqual = false;
			
		}
		
		

	}

}
