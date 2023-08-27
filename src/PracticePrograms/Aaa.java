package PracticePrograms;

public class Aaa {

	public static void main(String[] args) {

		//White spacees
		String str ="V E L Ooo C I T Y";
		int count=0;
		for(int i=0; i<str.length()-1; i++)
		{
			char st= str.charAt(i);
		
		if(st=='O'||st=='o') //(st==' ')
		{
			count++;
		}
		
		}
		
		System.out.println(count);
		
	
	}

}
