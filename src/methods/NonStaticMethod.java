package methods;

public class NonStaticMethod {
public void myMethod2()
{
	System.out.println("Im Inside Non static Method");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NonStaticMethod obj = new NonStaticMethod();
obj.myMethod2();
	}

}
