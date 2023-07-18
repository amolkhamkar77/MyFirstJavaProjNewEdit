package logicalPrograms;

public class CountOfNumber {

	public static void main(String[] args) {
		int num = 703832;
		int count =0;
		int temp= num;
		System.out.println("Given number is = "+num);
		
		while(num>0)
		{
			num=num/10;
			count=count+1;
		}
System.out.println("Number of digit present in "+temp+" is "+count);
	}
}
