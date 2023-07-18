package logicalPrograms;

public class PrintOddNumByUsingWhileLoop {

	
	public static void main(String[] args) {
		
		int count = 0;
		int i = 55;
		while(i>=11)
		{
			count++;
			System.out.println(i);
			i=i-2;
			
		}
		System.out.println("----------------");
		System.out.println("Total odd number count = "+count);

	}

}
