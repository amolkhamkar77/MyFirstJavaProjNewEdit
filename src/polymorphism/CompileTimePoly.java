package polymorphism;

public class CompileTimePoly {
	//Method Overloading
	//1. no. of arguments should be differnt
	// 2. data type should be different
	//3.sequence of args should be different
	
	public void sum(int a) //method name same in all methods
	{  
		System.out.println(a);
	}
	public void sum(int a , int b)
	{
		System.out.println(a+b);
	}
	public void sum(double c , double d)
	{
		System.out.println(c+d);
	}

	public static void main(String[] args) {
		CompileTimePoly m = new CompileTimePoly();
		m.sum(5);
		m.sum(15, 8);
		m.sum(12.5, 17.5);
	}
}
