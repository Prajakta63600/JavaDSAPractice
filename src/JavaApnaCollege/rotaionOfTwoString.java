package JavaApnaCollege;

public class rotaionOfTwoString {

	public static void main(String[] args) {
		String str1= "JavaJ2eeStrutsHibernate";
		String str2 = "StrutsHibernateJavaJ2ee";
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Given 2 strings are not rotation version");
		}else
		{
			String str3 = str1+str1;
			
			if(str3.contains(str2))
			{
				System.out.println("Given string is rotaion version");
			}
			
		}
		

	}

}
