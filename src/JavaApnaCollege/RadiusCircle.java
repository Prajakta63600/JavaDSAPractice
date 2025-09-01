package JavaApnaCollege;

import java.util.Scanner;

public class RadiusCircle {
	public static double circumfaranceOfCircle(int r)
	{
		//int circle;
		double pi=Math.PI;
		return (2*r*pi);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println(circumfaranceOfCircle(r));
		

	}

}
