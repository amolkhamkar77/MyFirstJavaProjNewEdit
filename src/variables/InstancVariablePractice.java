package variables;

public class InstancVariablePractice {
int a = 20;
int b = 40;

	public static void main(String[] args) { // we can change the position of main method and method statement
		InstancVariablePractice ivp = new InstancVariablePractice();
		ivp.substraction();
		ivp.division();

	}
public void substraction() {
	int c = b-a;
	System.out.println(c);
}
public void division() {
	int d= b/a;
	System.out.println(d);
}
}
