package pract1;

public class praqw1 {

	public static void main(String[] args) {
		
		int a = 5;
		int flag =0;
		
		for(int i=2; i<a; i++)
		{
			if(a%i==0)
			{
				flag=1;
				}
		}
		
		if(flag==0)
		{
		System.out.println(a +"is prime");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}

}
