package constructor;

public class ClassConstructor {
	
	//1. variable dclaration
	// 2. variable initialization
	// 3. Usage
	
	String name;  //Declaration
	int a;
	
    ClassConstructor()
{
	name = "Rahul"; // initialization
	a = 25;
	System.out.println("name is "+name+" and age is "+a+"");// usage
	System.out.println(name +  a);
}
	public static void main(String[] args) {
		//new ClassConstructor();
		ClassConstructor obj = new ClassConstructor();
		
	
	}

}
