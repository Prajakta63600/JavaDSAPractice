package JavaApnaCollege;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		int num = 153;
		double sum =0;
		int isArmstrong = num;
	
		int n = String.valueOf(num).length();
		
		while(num>0)
		{
			int rem = num%10;
			sum = sum + Math.pow(rem, n);
			num = num/10;
		}
		if(isArmstrong == sum)
		{
			System.out.println("give number is armstrong");
		}else
		{
			System.out.println("Given number is not armstrong");
		}

	}

}
