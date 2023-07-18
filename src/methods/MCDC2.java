package methods;

public class MCDC2 {
	
	//public void amol()
	//{
	//	System.out.println("amol");
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MCDC1.eat();        // Static method...so called by static way

MCDC1 obj = new MCDC1(); // Non Static method calling
obj.Drink();

//MCDC2 d=new MCDC2();  it just check for RUNTIME POLYmorphism method... this trick work succesfully
//d.amol();
	}

}
