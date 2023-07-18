package logicalPrograms;

public class Prime_Number_Identification {

	public static void main(String[] args) {
		// E.g 2,3,5, 7,11,13,17,23,29, 31,37,41,43,47,53,59,91,67,71,73,79,83,9,97
	int num = 17;
	int count = 0;
		for(int i = 2; i<num; i++)
		{
			if(num % i == 0) // 47 is only divide by itself i.e 47
			{
				count++;
				break;
			}
		}
	if(count >= 1)
	{
	//System.out.println(count); // when count is 1 or more than 1 then number is not prime
	System.out.println("Given Number "+num+" is Non-Prime");
	}
	else
	{
	//System.out.println(count); // when count is 0 then number is prime
	System.out.println("Given Number "+num+" is Prime");
	}
	}
}
