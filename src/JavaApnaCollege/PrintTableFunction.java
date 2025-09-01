package JavaApnaCollege;

import java.util.Scanner;

public class PrintTableFunction {
	public static void printTable(int n)
	{
		int table;
		for(int i=1; i<=10; i++)
		{
			table = n*i;
			System.out.println(n+" * "+i+" = "+table);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		printTable(n);
		

	}

}
