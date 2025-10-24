package JavaApnaCollege;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		String[] words = str.split(" ");
		
		String StringstrReverse  = "";
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			String wordReverse ="";
			
			for(int j=word.length()-1; j>=0; j--)
			{
				wordReverse = wordReverse + word.charAt(j);
			}
			
			StringstrReverse= StringstrReverse + wordReverse+" ";
		}
		
		System.out.println(StringstrReverse);

}
}
