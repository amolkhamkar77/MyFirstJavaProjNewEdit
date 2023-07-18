package PracticePrograms;

public class thisByMethod {

	public void mymethod()
	{
		this.mymethod2(0);
		System.out.println("amol1");
	}
	public void mymethod2(int a)
	{
		//this.mymethod();
		System.out.println("amolwwww");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisByMethod d = new thisByMethod();
		d.mymethod();
		//d.mymethod();
	}

}
