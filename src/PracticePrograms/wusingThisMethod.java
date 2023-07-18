package PracticePrograms;

public class wusingThisMethod {
int a;
	public void mymethod1(int a)
	{
		System.out.println(a);
		this.a = a;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
	}
	
	public void mymmethod2()
	{
		System.out.println(a);
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wusingThisMethod d = new wusingThisMethod();
		d.mymethod1(8);
		d.mymmethod2();
		
	}

}
