package ThisKeyword;

public class UsingThisKeyword {
	int a; // Global variable
	
	public void myMethod(int a)
	{
		System.out.println(a);
		this.a=a;                //if we dont use this keyword then fun method output become zero ...
		System.out.println(this.a);  // Extra Statement
	}
	public void fun()
	{
		System.out.println(a+a);   // insert a only... 
	}

	public static void main(String[] args) {
		
		UsingThisKeyword d = new UsingThisKeyword();
		d.myMethod(9);
		d.fun();
	}

}
