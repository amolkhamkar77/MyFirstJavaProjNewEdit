package multipleInheritance;

public class LemonJuice implements Water, Salt, Lemon, Sugar, Ice {

	public static void main(String[] args) {
		
		LemonJuice l = new LemonJuice();
		l.TakeWater();
		l.addSugar();
		l.AddLemon();
		l.addIce();
		l.AddSalt();
		

	}

	
	public void AddLemon() {
	System.out.println("Cut one Lemon in two equal pieces");
	System.out.println("pinch it");
		
	}

	
	public void AddSalt() {
		System.out.println("Add very small amount of Salt ");
		System.out.println("Your Lemon juice is ready");
	}

	
	public void TakeWater() {
		System.out.println("Take a Glass of Water first then");
		
	}



	public void addIce() {
		System.out.println("Add Cube of Ice ");
		
	}


	
	public void addSugar() {
		System.out.println("Add two tea spoon of Suger ");
		
	}

}
