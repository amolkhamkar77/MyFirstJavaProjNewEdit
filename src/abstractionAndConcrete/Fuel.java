package abstractionAndConcrete;

public abstract class Fuel { //Abstract class 
	
	abstract public void petrol();// incomplete method or abstract method
	// i.e No method body and no printing statement
	
	public void ready() //complete method or non abstract method
	{
		System.out.println("Ready to Go");
	}
}
