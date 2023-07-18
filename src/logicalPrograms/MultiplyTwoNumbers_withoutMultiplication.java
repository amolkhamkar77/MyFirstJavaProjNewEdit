package logicalPrograms;

public class MultiplyTwoNumbers_withoutMultiplication {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 7;
		int sum=0;
		for(int i=1; i<=num2; i++) // num2 bcoz we want to repeat the loop for seven times
		{
		sum = sum+num1; // repeate for 7 times
		}
		System.out.println(sum);
	}      
}

//0+5=5
//5+5=10
//10+5=15
//15+5=20
//20+5=25
//25+5=30
//30+5=35