package NewBookPrograms;

import java.util.Scanner;

public class PyramidTirangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
//		for(int i=1; i<=num; i++)
//		{
//			for(int s=i; s<num; s++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<i; j++) {
//				System.out.print(j+1);
//			}
//			for(int n=i-1; n>=1; n--) {
//				System.out.print(n);
//			}
//			System.out.println();
//		}

		
		for(int i=num; i>0; i--) {
			for(int s=i-1; s>0; s--) {
				System.out.print(" ");
			}
			for(int j=i; j<=num; j++) {
				System.out.print(j);
			}
			for(int n=num-1; n>=i; n--) {
				System.out.print(n);
			}
			System.out.println();
		}
	}

}
