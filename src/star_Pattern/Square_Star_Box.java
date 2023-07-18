package star_Pattern;

public class Square_Star_Box {

	public static void main(String[] args) {
//Always start with rows (outer for loop)
		for(int i=0; i<=3; i++) // for Rows =3
		{
			for(int j=0; j<=5; j++) // for column =5
			{
				System.out.print("*"); // use only print , to print star in one line
			}
			System.out.println(); // use println to move in next line
		}
	}

}
