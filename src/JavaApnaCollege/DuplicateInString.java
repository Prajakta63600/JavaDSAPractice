package JavaApnaCollege;

public class DuplicateInString {

	public static void main(String[] args) {
		String str= "Better Butter";
		str = str.replaceAll(" ", "").toLowerCase();
		int count =1;
		char[] duplicate = str.toCharArray();
		boolean[] visiter = new boolean[duplicate.length];
		for(int i=0; i<duplicate.length; i++)
		{
			if(visiter[i])
			{
				continue;
			}
			for(int j=i+1; j<duplicate.length; j++)
			{
				if(duplicate[i]==duplicate[j])
				{
					count++;
					visiter[j]=true;
				}
			}
			if(count>1)
			{
				System.out.println(duplicate[i]+" : "+count);
			}
		}

	}

}
