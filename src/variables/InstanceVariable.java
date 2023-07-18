package variables;

public class InstanceVariable {
	int ab = 40; // Instance variable or Globale variable
	int ac;
	double hh;
	String str;
	boolean bt;
	public void myMethod()
	{
		System.out.println(ab);
		System.out.println(ac);
		System.out.println(hh);
		System.out.println(str);
		System.out.println(bt);
	}

	public static void main(String[] args) {
		
		InstanceVariable d = new InstanceVariable();
		d.myMethod();
	}

}
