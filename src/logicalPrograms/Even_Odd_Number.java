package logicalPrograms;

import java.util.Scanner;

public class Even_Odd_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = scan.nextInt();
		if( num % 2 == 0)
		{
		System.out.println("Entered No is Even");
		}
		else
		{
		System.out.println("Entered No is Odd");
		}
		}
}
