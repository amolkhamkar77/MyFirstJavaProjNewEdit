package logicalPrograms;

public class Print_PrimeNumber_Between_1_10 {

	public static void main(String[] args) {
		
		int flag =0;
	for(int i=2; i<=10; i++)// 2<=10...3<=10...4<=10...
	{
		for(int j=2; j<i; j++)//2<2false...
		{
			if(i%j==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println(i+"Number is Prime");
		}
		else
		{
		 flag =0;
		}
	}//outer FOR loop for printing 1 to 10 numbers
	// inner FOR loop for printing prime numbers
	}

}
