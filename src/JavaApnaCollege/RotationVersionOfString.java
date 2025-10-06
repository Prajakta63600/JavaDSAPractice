package JavaApnaCollege;

public class RotationVersionOfString {

	public static void main(String[] args) {
		String str1 = "JavaJ2eeStrutsHibernate";
		String str2 = "StrutsHibernateJavaJ2ee";
		
		if(str1.length()==str2.length())
		{
			String str3 = str1+str2;
			if(str3.contains(str2))
			{
				System.out.println("String is rotational");
			}else 
			{
				System.out.println("String is not rotational");
			}
		}else
		{
			System.out.println("String is not rotataional");
		}

	}

}
