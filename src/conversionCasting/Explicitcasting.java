package conversionCasting;

public class Explicitcasting {
		//Converting of Higher datatype of information into lower datatype of information
	// also known as Forcefull casting or Narrowing conversion
	// there may loss of data
	public static void main(String[] args) {
	
		int i = 100000;
		short c= (short)i;        //int > short
		System.out.println(c);
		
short a = 100;
byte b= (byte)a;
System.out.println(b);

float d= 57.99f;
short s= (short)d;
System.out.println(s);
	}
}         //Java does not support Boolean Casting.bcoz we can not convert true into false 
