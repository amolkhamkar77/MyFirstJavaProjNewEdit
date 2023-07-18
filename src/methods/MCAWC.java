package methods;

public class MCAWC {
public void mobile()
{
	System.out.println("i have a mobile");
}
public void computer(int a) //int a is argument, so in method calling we pass the same argument i.e numerical value
{
System.out.println("i have a computer");
}
public void laptop(String a) // String a is argument so in Method caliing we writee word.
{
	System.out.println(" i have a laptop");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MCAWC obj = new MCAWC();
obj.mobile();
obj.computer(3);
obj.laptop("HP");
	}

}
