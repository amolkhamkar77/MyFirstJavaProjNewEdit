package ThisKeyword;

public class WuThisKeyword {
	
	int a;// globale variable
	public void myMethod(int f) //Local Variable

	{
		System.out.println(f);
		a=f;    // in myMethod there is "int f" and in fun method there is "a"... for making connection between them we use a=f
		//System.out.println(a);   // extra statement
	}
	
  public void fun()
  {
	  System.out.println(a);
  }

	public static void main(String[] args) {
		
		WuThisKeyword d = new WuThisKeyword();
		d.myMethod(7);
		d.fun();
	}

}
