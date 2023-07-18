package loopingsStatements;

public class NestedForLoop {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) // 1<=5...2<=5...3<=5...4<=5....5<=5...6<=5(false) terminate here
		{
			                     // this is for j values
			                     //1<=1...2<=1(false, terminate here)
			                     //1<=2...2<=2...3<=2(false, terminate here)
			                     //1<=3...2<=3...3<=3...4<=3(false, terminate here)
			                     //1<=4...2<=4...3<=4...4<=4...5<=4(false, terminate here)
			                     //1<=5...2<=5...3<=5...4<=5...5<=5...6<=5(false, terminate here)
			for(int j=1; j<=i; j++)
			{
			System.out.print("*");
			}
			System.out.println(); // this statement will help to move the cursor to the next line
		}		
	}
}
