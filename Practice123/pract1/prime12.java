package pract1;

public class prime12 {

	
		public static void main(String[] args) {
		int temp=0;
		int num=13;
		for(int i =2;i<=num-1;i++)
		{
		if (num%i==0) // this condition is false then, it will skip then temp+1 step is skipped
		 {
		 temp=temp+1;
		 }
		
		}
		if (temp>0)
		{
		System.out.println("not a prime number");
		}
		else
		{
		System.out.println("prime number");
		}
		}
		}
