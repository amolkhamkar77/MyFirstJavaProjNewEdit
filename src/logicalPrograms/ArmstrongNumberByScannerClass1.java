package logicalPrograms;

import java.util.Scanner;

public class ArmstrongNumberByScannerClass1 {
		public static void main(String[] args) {
			
			
			Scanner s=new Scanner(System.in);
		    System.out.println("Enter The Number");
		    int num=s.nextInt();
			//int num =371; // 1,2,3,4,5,6,7,8,9,153,370,371,407,1634,8208,9474,54748...etc are armstrong num
			int temp;
			int rev=0;
			int arms=num;
			
			while (num>0) {
				
				
				for(int i=1; i<=200; i++)// 2<=10...3<=10...4<=10...
				{
					//for(int j=1; j<i; j++)//2<2false...
				//	{

						temp = num%10;
						num= num/10;
						rev= rev + temp*temp*temp; // for four digit number use   temp*temp*temp*temp
				
				
			//}
			 {
				System.out.println(i+"Its an Armstrong No");
			}
			
		}
			}
		}
}
