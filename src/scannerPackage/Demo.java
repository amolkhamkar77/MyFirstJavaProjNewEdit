package scannerPackage;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);  // hower on scanner ...> import java.util.scanner file is imported
		System.out.println("Enter the first name");
		
		int a = s1.nextInt();  // for int we use nextInt
		System.out.println("Enter the second number");
		int b = s1.nextInt();
		int c = a+b;
		System.out.println("this is the required addition "+c);
		
		
		System.out.println("Write your name");
		String name = s1.next(); // For String we use only "next"
		System.out.println("My name is "+name);
	}

}
