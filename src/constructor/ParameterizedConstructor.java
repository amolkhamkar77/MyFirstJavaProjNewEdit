package constructor;

public class ParameterizedConstructor {
	
	ParameterizedConstructor()
	{
		System.out.println("Zero Argument Constructor");
	}
	ParameterizedConstructor(int a)
	{
		System.out.println("Argument");
	}
	ParameterizedConstructor(String s)
	{
		System.out.println("23 Argument constructor type string");
	}
	public static void main(String[] args) {
		new ParameterizedConstructor();
		new ParameterizedConstructor(5);
		new ParameterizedConstructor("amol");

	}

}
