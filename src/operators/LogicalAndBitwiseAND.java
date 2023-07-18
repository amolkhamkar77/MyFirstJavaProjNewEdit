package operators;

public class LogicalAndBitwiseAND {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a<b && a++<c);
		// false && true = false
		System.out.println(a);
		// for false caes it doesnt change value of "a"
		System.out.println( a++<c & b<a);
		// true && true = true
		System.out.println(a);
		// privious case is true thats why it take new value of "a"
	}

}
