package logicalPrograms;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// interchange the number
		//using three variable
		int a=10; //20
		int b=20;  //10
		int c; 
		//here we are taking three variables because interchanging the vallue of two
		//  variable means both variables are equal i.e a=b= 10 or 20
		System.out.println("Before swapping "+a+"" +b);
		c=b; //c=20
		b=a;  //b= 10
		a=c;  // a=20
		
		System.out.println("After swapping "+a+" "+b);
	}
}
