package variables;

public class Localariable {
	public void myMehod() {
	// static int b = 50; not applicable
	int a = 20; // Local variable
	//int a =40; dublicates are not allowed
	{
		System.out.println(a);
		System.out.println(a);}
	}
	public static void main(String[] args) {
		
		Localariable d = new Localariable();
		d.myMehod();
	}

}
