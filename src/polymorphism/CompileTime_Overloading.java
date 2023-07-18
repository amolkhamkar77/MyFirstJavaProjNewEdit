package polymorphism;

public class CompileTime_Overloading {

	//Method Overloading
		//1. no. of arguments should be differnt
		// 2. data type should be different
		//3.sequence of args should be different
		
		public void multiply(int a) //method name same in all methods
		{  
			System.out.println(a);
		}
		public void multiply(int a , int b)
		{
			System.out.println(a*b);
		}
		public void multiply(double c , double d)
		{
			System.out.println(c*d);
		}

	public static void main(String[] args) {
		CompileTime_Overloading m =new CompileTime_Overloading();
		m.multiply(5);
		m.multiply(5, 4);
		m.multiply(5.5, 10.5);
	}
}
