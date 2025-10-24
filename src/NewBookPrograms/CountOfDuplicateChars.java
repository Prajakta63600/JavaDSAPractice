package NewBookPrograms;

public class CountOfDuplicateChars {

	public static void main(String[] args) {
		String str="Better Butter";
		str = str.replace(" ", "").toLowerCase();
		char[] chars = str.toCharArray();
		boolean[] duplicate = new boolean[chars.length];
		for(int i=0; i<chars.length; i++) {
			if(duplicate[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1; j<chars.length;j++) {
				if(chars[i]==chars[j])
				{
					duplicate[j]=true;
					count++;
				}
			}
			if(count>0) {
			System.out.println(chars[i]+" : "+count);
			}
		}
		}

	}


