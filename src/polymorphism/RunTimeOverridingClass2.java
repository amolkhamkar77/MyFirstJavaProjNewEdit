package polymorphism;

public class RunTimeOverridingClass2 extends RunTimeOverriding {

	public void eat(int a)
	{
		System.out.println("i want to eat ice-cream");
	}
	public static void main(String[] args) {
		RunTimeOverridingClass2 i = new RunTimeOverridingClass2();
		i.eat(2);
		
		RunTimeOverriding d = new RunTimeOverriding();
		d.eat(2);
	}
}

// without Extends word it run successfully