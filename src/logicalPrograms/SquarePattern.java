package logicalPrograms;

public class SquarePattern {

	public static void main(String[] args) {
		int i;
		int j;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if(i>=2 && j>=2 && i<=4 && j<=4 )// i= row, j= colomn
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	
	}
}
