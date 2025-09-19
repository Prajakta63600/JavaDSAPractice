package JavaApnaCollege;

import java.lang.reflect.Array;
import java.util.Arrays;

public class seperateZeroAndNonZero {
	
	public static void sepearteZero(int[] num)
	{
		int count =0;
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i]!=0)
			{
				num[count]= num[i];
				count++;
			}
		}
		
		while(count<num.length)
		{
			num[count]=0;
			count++;
		}
		System.out.println(Arrays.toString(num));
	}

	public static void main(String[] args) {
		int[] num = {4, 0,3,0,6,0,0,9,3,0};
		
		sepearteZero(num);
		

	}

}
