package JavaApnaCollege;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Prajakta Naik";
		String rev = "";
		str = str.replaceAll(" ", "");
		
		//Using itrative method
//		for(int i =str.length()-1; i>=0; i--)
//				{
//					rev = rev+str.charAt(i);
//				}
//			System.out.println(rev);
		
		//converting string into char and then reverse
//		char[] reverse = str.toCharArray();
//		
//		
//		for(int i=reverse.length-1; i>=0; i--)
//		{
//			System.out.print(reverse[i]);
//		}
	
		//Using StringBuffer
		StringBuffer stb = new StringBuffer(str);
		System.out.println(stb.reverse());

	}

}
