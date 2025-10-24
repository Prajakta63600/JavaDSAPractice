package JavaApnaCollege;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DeleteNumberFromArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		
		System.out.println("Enter a size of numbers");
		int size = sc.nextInt();
		
		System.out.println("Enter " +size+" any numbers between 1 to 50");
		for(int i=0; i<size; i++)
		{
			int num = sc.nextInt();
			if(num>=1 && num<=50)
			{
				list.add(num);
			}else {
				System.out.println("Enter a valid number which is between 1 and 50");
				i--;
			}
			
		}
		Iterator<Integer> it = list.iterator(); {
			while(it.hasNext())
			{
				if(it.next()>25)
				{
					it.remove();
				}
			}
		}
		System.out.println("Removed list "+list);
		
		

	}

}
