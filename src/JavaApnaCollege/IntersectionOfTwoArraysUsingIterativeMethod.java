package JavaApnaCollege;

import java.util.HashSet;

public class IntersectionOfTwoArraysUsingIterativeMethod {

	public static void main(String[] args) {
		String[] str1 = {"One", "Three", "Four", "Six", "Seven"};
		String[] str2 = {"Three", "Four", "Seven", "One", "Eight", "Seven"};
		
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<str1.length; i++)
		{
			for(int j=0; j<str2.length; j++)
			{
				if(str1[i].equals(str2[j]))
				{
					set.add(str1[i]);
				}
			}
		}
		System.out.println(set);

	}

}
