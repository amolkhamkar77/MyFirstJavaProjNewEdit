package logicalPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		// Fibonacci= 0 1 2 3 4 5 adding number... firstly add first two numbers and then add this addition to next number
		// eg 0+1=1... this 1+ 2=3...this 3+  4= 7....etc
		
		System.out.println("Printing Fibonacci series less than 20");
		
		int a=0;   // first number of the series
		int b=1;   // second number of theseries
		int c=0;
		System.out.println(a+" "+b);  // starting with 0 and 1
		
	while(c<20) //condition..0<20..1<20..2<20..3<20.....21<20(false condition)
		{
			c=a+b;  //c= 1+2= 3
	 //System.out.println(" "+c);........u can keep this statement here also
			a=b; // interchange the number...a=1
			b=c;// interchange the number....b=3
			System.out.println(" "+c);
		}
	}
}
