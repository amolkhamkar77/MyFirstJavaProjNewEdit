package methods;

public class MCWC1 {
public static void fun1()
{
	System.out.println("im inside static method fun1");
}
public void fun2() 
{
	System.out.println("im inside non static method fun2");
}
	public static void main(String[] args) {
		
MCWC1.fun1();
MCWC1 obj = new MCWC1();
obj.fun2();
	}

}
