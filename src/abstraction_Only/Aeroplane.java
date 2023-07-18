package abstraction_Only;

public class Aeroplane extends Fuel1 {
// Aeropalane required aviation type of petrol
	@Override
	public void petrol() {
		System.out.println("Aviation petrol is beign filled in Aeroplane");
	}
}
