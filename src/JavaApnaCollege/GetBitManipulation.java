package JavaApnaCollege;

public class GetBitManipulation {

	public static void main(String[] args) {
		int n =5;
		int pos = 2;
		int bitmask = 1<<pos;
		
		if((bitmask & n)==0)
		{
			System.out.println("bit was zero");
		}else
		{
			System.out.println("Bit was not zero");
		}

	}

}
