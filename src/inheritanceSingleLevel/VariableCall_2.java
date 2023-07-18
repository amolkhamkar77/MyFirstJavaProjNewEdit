package inheritanceSingleLevel;

public class VariableCall_2 extends VariableCall_1 {

	public static void main(String[] args) {
		System.out.println(a); // static variable
		System.out.println(c);  // static variable
		
		VariableCall_2 x = new VariableCall_2();
		System.out.println(x.b); // non static variable..so.. used x.b in argument
	}
}
