package inheritance_Multiple_Level;

public class MakeCoffee implements Milk, Sugar, Coffee, Ice, ChocolateSyrup {
	// MakeCoffee is subclass
	// milk coffee ice, choco, sugar all are super class

	public static void main(String[] args) {
		
		MakeCoffee c = new MakeCoffee();
		c.addMilk();
		c.addCoffee();
		c.addSugar();
		c.addIce();
		c.addChocolateSyrup();
		
	}

	
	public void addChocolateSyrup() {
		System.out.println("Add Chocolate Syrup"); // we can write multiple lines of code inside method body
		System.out.println("Our Coffee is Ready to Drink");
		
	}

	
	public void addIce() {
		System.out.println("Add Ice Cubes");
		
	}

	
	public void addCoffee() {
		System.out.println("Add Coffee powder");
		
	}

	
	public void addSugar() {
		System.out.println("Add Sugar");
		
	}

	
	public void addMilk() {
		System.out.println("For Making My Favourite Coffee");
		System.out.println("Take a Glass of Milk");
		
	}

}
