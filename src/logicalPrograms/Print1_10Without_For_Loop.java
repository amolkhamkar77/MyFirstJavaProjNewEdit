package logicalPrograms;

public class Print1_10Without_For_Loop {

	public void myMethod(int a)
	{
		if(a<=10) // initially it take a=1...bcoz we provide input at method calling
		{		 // 1<=10...2<=10...3<=10.....continue till cond become false
			System.out.println(a); //a=1...2...3...4....
			myMethod(a+1);  //2...3..4...5...
		}
	}
	
	public static void main(String[] args) {
		Print1_10Without_For_Loop p = new Print1_10Without_For_Loop();
		p.myMethod(1); // if we want printing numbers start from other numbers i.e 3 ..4 etc 
	}					// then insert that number insted of 1 at method calling

}
