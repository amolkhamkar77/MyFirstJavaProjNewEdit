package logicalPrograms;

public class PrimeNumber {
	// PRIME Number: is the number which is divided by "one" and the number itself.

	public static void main(String[] args) {
		
		int a = 5;
		int flag = 0;
		
		for(int i=2; i<=a-1; i++) // number is divisible by one and number itself.. so we cant take them in this bracket..ex.i.e we are taking except 1 & 5
		{  //2<=2...3<=2 false 
			if(a%i==0) // in modulo reminder will be the answer..
				       // if this condition is true then flag 1 will be executed
				       // if condition is false then flag 0 will be executed
			{
				flag=1; // flag is the helping variable... u can take anyother word insted of flag word.
			}
		}
		if(flag==0)
		{
			System.out.println(a+" its a prime Number");
		}
		else
		{
			System.out.println("its not a prime number");
		}
	}

}
