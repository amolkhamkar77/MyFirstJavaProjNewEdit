package conversionCasting;

public class ImplicitCasting {
		//Converting lower data type of information into higher data type
	public static void main(String[] args) {
		// also know as Automatic casting or widening conversion
		// No Loss of data in this process
		//realtime example is shifting the flat from 1BHK to 2BHK
		byte b =10;
		short h =b;     // byte < short.....byte size is 8bit while short size is 2byte
		System.out.println(h);

		short s= 100;
		int a =s;
		System.out.println(a);
		
	   int n =1010;
	   long l =n;
	   System.out.println(l);
	}
}
