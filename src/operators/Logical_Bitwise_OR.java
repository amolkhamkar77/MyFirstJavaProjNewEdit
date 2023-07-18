package operators;

public class Logical_Bitwise_OR {

	public static void main(String[] args) {
		// Logical OR ||
				// 1. It doesnt check second condition if first condition is true
				//2. it check second condition if first condition is false.
				System.out.println("=====Logical OR || =======");
				int a = 10;
				int b =20;
				
				System.out.println(a>b || b<a); //False || False ----> False
				System.out.println(a<b || b>a); // True || True -----> True
				System.out.println(a<b || b<a); // True || false ----> True
				
				System.out.println("======Bitwise OR |  =====");
				
				// Bitwise OR |
				// Bitwise OR | operator alway check both condition whether first condition is true or false
				
				System.out.println(a<b | b>a);// true|true---> true
				System.out.println(b>a | a>b);// true | false ---> true
				System.out.println(a>b | b>a);// false | true ---> true
				System.out.println(b<a | a>b);// false | false ---> false

	}

}
