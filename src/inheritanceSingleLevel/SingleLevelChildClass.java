package inheritanceSingleLevel;

public class SingleLevelChildClass extends SingleLevelParentClass  { //child class or sub class
	
	public void job()
	{
		System.out.println("Son has his own job");
	}
	public void bike()
	{
		System.out.println("Son has his own Bike");
	}

	public static void main(String[] args) {
		SingleLevelChildClass abc = new SingleLevelChildClass();
		abc.bike();
		abc.job();
		abc.home();
		abc.farm();
		
		
		//Traditional way or way which is used in method calling.
		// it doesnt required extends keyword
		//SingleLevelParentClass b = new SingleLevelParentClass();
		//b.home();
		//b.farm();

	}

}
