package ThisKeyword;

public class InvokeConstructor {

	InvokeConstructor()
	{
		this(2);
		System.out.println("Non Parameterized Constructor");
	}
	InvokeConstructor(int a)
	{
		System.out.println("parameterized constructor");
	}
	public static void main(String[] args) {
		
		new InvokeConstructor();
	}

}