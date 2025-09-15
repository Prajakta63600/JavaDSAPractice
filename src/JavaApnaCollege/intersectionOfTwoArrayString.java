package JavaApnaCollege;

import java.util.HashSet;

public class intersectionOfTwoArrayString {
	public static void intersectArray(String[] str1, String[] str2)
	{
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0; i<str1.length; i++)
		{
			for(int j=0; j<str2.length; j++)
			{
				if(str1[i]==str2[j])
				{
					set.add(str2[j]);
				}
			}
		}
		System.out.println(set);
	}

	public static void main(String[] args) {
		String[] str1 = {"one", "two", "three", "five", "six"};
		String[] str2 = {"two", "six", "four","seven", "nine"};
		
		intersectArray(str1, str2);

	}

}
