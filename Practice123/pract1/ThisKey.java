package pract1;

public class ThisKey {

	int a;
	ThisKey()
	{this(5);
		System.out.println("non parameterize constructor");
		
	}
	ThisKey(int a)
	{
		System.out.println("parameterized constructor");
		
	}
	
	public static void main(String[] args) {
		new ThisKey();
		
	}

}
