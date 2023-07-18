package PracticePrograms;

public class Practiceprogram1 {
public static void mymethod1()
{
	System.out.println("Im in Static method fun1");
}
public void mymethod2()
{
	System.out.println("im in non static method fun2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Practiceprogram1.mymethod1();
Practiceprogram1 obj = new Practiceprogram1();
obj.mymethod2();
	}

}
