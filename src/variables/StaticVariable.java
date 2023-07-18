package variables;

public class StaticVariable {
	static int a =100;
	static int b = 10;

	public static void main(String[] args) {
		StaticVariable sv =new StaticVariable();
		sv.addition();
		sv.division();

	}
public void addition() {
	int c = a+b;
	System.out.println(a);
	System.out.println(c); // we can directly use a+b inside bracket
}

public void division()
{
	System.out.println(b);
	System.out.println(a/b);
}
}
