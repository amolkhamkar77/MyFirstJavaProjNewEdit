package operators;

public class UnaryOperators {

	public static void main(String[] args) {
	// postfix (incrementing ++)
		int a = 10;
		System.out.println(a);  //10
		System.out.println( a++); //10 become 11 ---but first count a only i.e 10
		System.out.println( a); // 11
		System.out.println(a++);// 11---->12
		
		
		System.out.println("======postfix Decrementing=======");
		int b = 10;
		System.out.println(b);//10
		System.out.println(b--);//10
		System.out.println(b);//9
		
		// Prefix incrementing
		System.out.println("======Prefix incrementing=======");
		int c =20;
		System.out.println(c);//20
		System.out.println(++c);//21
		System.out.println(c);//21
		
// Prefix Decrementing
		System.out.println("======Prfix decrementing=====");
		
		int d = 15;
		System.out.println(d);//15
		System.out.println(--d);// 14
		System.out.println(d);//14
	}

}
