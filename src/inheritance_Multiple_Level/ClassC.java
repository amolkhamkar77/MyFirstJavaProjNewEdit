package inheritance_Multiple_Level;

public class ClassC extends ClassB , ClassA {
	// Java doesnt support multiple inheritance because it result in Diamond ambiguity problem
	public void show2()
	{
		System.out.println("im in last step of show method");
	}
	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.show1();
		c.show2();	
	}
}
