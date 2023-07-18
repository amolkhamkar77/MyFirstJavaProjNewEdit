package logicalPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Factorial of 5!= 5*4*3*2*1=120
		//int num;
        int fact = 1;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = s1.nextInt();
        
        for(int i=1; i<=num; i++) //1<=5...2<=5...3<=5...4<=5...5<=5...6<=5false
        	
        {
        	fact = fact *i;  //fact= 24*5
        }
        System.out.println("Factorial of "+num+" is ="+fact);
	}
}
