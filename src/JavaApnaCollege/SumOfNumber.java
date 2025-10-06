package JavaApnaCollege;

public class SumOfNumber {
	public static int sumOfGivenNumber(int num)
	{
		int sum=0, rem;
		
		while(num>0)
		{
			rem = num%10;
			sum += rem;
			num = num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num = 4569;
//		int sum =0;
//		int rem;
//		
//		while(num>0)
//		{
//			rem = num%10;
//			sum += rem; //6, 6+5=11, 4+11=15
//			num = num/10;
//		}
//		System.out.println(sum);

		System.out.println(sumOfGivenNumber(num));
	}

}
