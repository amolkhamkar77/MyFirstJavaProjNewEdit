package logicalPrograms;


	public class Fibonacci {
		public static void main(String[] args) {
			
			int a = 0, b=1, c=10, d;

		   System.out.print(a+" "+b);
		   
		   for(int i=2; i<c; ++i) {
			   d=a+b;
			   System.out.print(" "+d);
			   a=b;
			   b=d;
		   }

		}
		}

