package logicalPrograms;

public class ReverseNumber_usingFORLoop {

	public static void main(String[] args) {
		int num = 12345;
		int revNum = 0;
		for (int i = num; i>0; i = i/10)
		{
		//	System.out.println(i);
		int rem = i % 10;
		revNum = revNum*10+ rem;            //i=1234
		}									// 1234 % 10=4
		System.out.println(revNum);			//	0+4=4--
		}
}
