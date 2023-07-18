package operators;

public class Logical_Bitwise_AND {

	public static void main(String[] args) {
		// Logical &&
		// 1. It doesnt check first condition if first condition is false
		//2. it check second condition if first condition is true.
		System.out.println("=====Logical &&=======");
		int a = 10;
		int b =20;
		
		System.out.println(a>b && b<a); //False && False ----> False
		System.out.println(a<b && b>a); // True && True -----> True
		System.out.println(a<b && b<a); // True && false ----> false
		
		System.out.println("======Bitwise & =====");
		
		// Bitwise &
		// Bitwise AND & operator alway check both condition whether first condition is true or falsse
		
		System.out.println(a<b & b>a);// true &true---> true
		System.out.println(b>a & a>b);// true & false ---> false
		System.out.println(a>b & b>a);// false & true ---> false
		System.out.println(b<a & a>b);// false & false ---> false
	}

}
