package PracticePrograms;

public class PrimeNumberPractice {

	public static void main(String[] args) {
    
		int a= 13;
		int flag=0;
		
		for(int i=2; i<=a-1; i++)
		{
			if(a%i==0)
			{
				flag=1;
			}
		}
	if(flag==0)
		{
			System.out.println(a+ " its a prime number");
		}
		else
		{
			System.out.println(" its not a prime number");
		}
	}

}
