package methods;

public class Method_intParameters {

	public static void main (String [] args)
	{
	addition(100, 200);
	addition(50, 25);
	Method_intParameters s9=new Method_intParameters();
	s9.mul(10, 25);
	}
	//static regular--> method with parameter (2 int parameter) (int,int)
	public static void addition(int a, int b)
	{
	int sum =a+b;
	System.out.println(sum);
	}
	//non-static regular--> method with parameter(2 int parameter)(int,int)
	public void mul(int a, int b)
	{
	int mulValue =a*b;
	System.out.println(mulValue);
	}
}
