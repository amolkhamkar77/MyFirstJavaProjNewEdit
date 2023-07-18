package operators;

public class ShiftOperator {

	public static void main(String[] args) {
		
		// Left Shift Operator --- Multiplication is used in this type
		int a = 10;
		System.out.println(a<<3);// 10*2^3=10*8=80
		System.out.println(a<<4);//10*2^4=10*16=160
		
		
		System.out.println("======Right Shift =====");
		int b = 50;
		// In Right Shift operator division method is applicable
		System.out.println(b>>3);//50/2^3= 50/8=Quetint is 6
		System.out.println(b>>2);// 50/2^2=50/4=12
		System.out.println(a>>4);// 10/2^4=10/16=0

	}

}
