package abstractionAndConcrete;

public class Car extends Fuel {

	public static void main(String[] args) {
		Car c = new Car();  // 1st way of calling method
		c.petrol();
		c.ready();
		
		//Fuel f = new Car(); // 2nd way of calling method
		//f.petrol();         // Here reference variable of the abstract class is used(i.e Fuel f)
		//f.ready();
		
		// we can use any one method
	}

	@Override
	public void petrol() {
		System.out.println("Normal car petrol is being filled in the car");
	}

}
