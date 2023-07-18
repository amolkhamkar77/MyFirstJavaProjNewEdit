package logicalPrograms;

public class frequencyOfAlphabates {

	public static void main(String[] args) {
		
		int counter = 0; // we can use only count also
		String str = "I Love nnnMy Counnnnntry";
		char c ='n';
		
		for(int i=0; i<str.length()-1; i++)
		{
			if(c==str.charAt(i))   // n==n
			{
				counter++;
			}
		}
System.out.println("Frequency of "+c+" ="+counter);
	}

}
