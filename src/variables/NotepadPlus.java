package variables;

public class NotepadPlus {

	
		int a = 10;
		static int b = 20;
		public static void m1()
		{
		int a = 30;
		System.out.println(a); // output=30
		}
		public void m2()
		{
		int a = 40;
		System.out.println(a); // output=40
		System.out.println(this.a); //10
		}
		public static void main(String[] args)
		{
		int a = 50;
		NotepadPlus n1 = new NotepadPlus();
		n1.m2();                   //40 & 10 non static method call
		System.out.println(n1.a);  //10  non static global variable
		System.out.println(b);     //20 static global variable
		NotepadPlus.m1();          //30  static method call
		
		System.out.println(a); //50 local variable
		
		
		NotepadAnother n2 = new NotepadAnother(); 
		System.out.println(n2.a); //60
		System.out.println(NotepadAnother.b); //70 static global variable from antr clss
		NotepadAnother.m3(); //80
		n2.m4(); //90
		}
}
