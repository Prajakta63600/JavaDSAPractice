package JavaApnaCollege;

public class PreservingThePositionOfString {

	public static void main(String[] args) {
		String str = "I am not String";
		char[] chars = str.toCharArray();
		char[] result = new char[chars.length];
		for(int i=0; i<chars.length; i++)
		{
			if(chars[i]==' ')
			{
				result[i]=' ';
			}
		}
		
		int j = result.length-1;
		for(int i=0; i<chars.length; i++)
		{
			if(chars[i]!=' ')
			{
				if(result[j]==' ')
				{
					j--;
				}
				result[j]=chars[i];
				j--;
			}
		}
		System.out.println(String.valueOf(result));

	}

}
