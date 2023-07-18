package mainMethodOverloading;

public class MainMethodOverloading {

	//Java search---> Original main method i.e (String [] args)

	public static void main(int a) {
		System.out.println("main method with int");
	}

	public static void main(int a, int b) {
		System.out.println("main method with 2 int");
	}
		public static void main(String[] args) {
			
			System.out.println("This is our Original method developed by java developers");
				
			//MainMethodOverloading.main(34); // ClassName.MethodName
			//MainMethodOverloading.main(33, 44);

								//OR
			main(34);                 //just type main and arguments
			main(33, 44);
				
				}
	
}
