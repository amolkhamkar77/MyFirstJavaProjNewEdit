package logicalPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
	
		int num = 542; // the number which is we can reverse
	//	int temp;
		int rev = 0;
		
		while(num>0) // 54>0...5>0...0>0
		{
//			temp= num%10;    //temp=2...temp =4.....temp= 5
//			num=num/10; // 123/10=12
//			rev= rev*10+temp; // rev= 0*10+2=2...rev=2*10+4=24.....rev=24*10+5=245
			    
			//OR
			rev= rev*10+num%10;
			num=num/10;
			
		//TRM...TRN...Temp.Rev.Num	
			//num=1
		}
		System.out.println(rev+"=Is is the required revers number");
	}
}
