package loopingsStatements;

public class NestedForLoopPyramid {

	public static void main(String[] args) {
		
      int space = 4;
      int star =1;
		for(int i=1; i<6; i++) 
	{
	
		for(int j=1; j<=space; j++) 
		{
			System.out.print(" ");
		}
		                 
			for(int j=1; j<=star; j++)
			{
				
			System.out.print("*");
			}
			System.out.println();  // used for changing the line
		space--;                    //one space is decrease in every line i.e 4..3..2..1..0
		star=star+2;                //+2 stars increases in every line i.e 1..3..5..7..9
	}
}	
}



