package JavaApnaCollege;

public class OccaranceOfEachCharacter {

	public static void main(String[] args) {
		String str ="Java J2EE Java JSP J2EE";
		str = str.replaceAll(" ", "").toLowerCase();
		
		char[] chars = str.toCharArray();
		boolean[] visit = new boolean[chars.length];
		boolean isEqual = true;
		for(int i=0; i<chars.length; i++)
		{
			if(visit[i])
			{
				continue;
			}
			int count =1;
			for(int j=i+1; j<chars.length; j++)
			{
				if(chars[i]==chars[j])
				{
					count++;
					visit[j] = true;
					
				}
			}
			if(count>1)
			{
				System.out.println(chars[i]+" : "+count);
			}
		}
		

	}

}
