package abstraction_Only;

public class Petre {

	public void toGoToAirportByCar()
	{
		System.out.println("Peter wants to use a car to go to airport");
	
	Fuel1 f = new Car1(); // method 1
	f.petrol();
	f.ready();
	
	//Car1 c = new Car1();  method 2
	//c.petrol();
	//c.ready();
	}
	
	public void flyAeroplane()
	{
		System.out.println("Now Peter will fly in Aeroplane to Europe");
	
	Aeroplane a = new Aeroplane();
	a.petrol();
	a.ready();
	}
}
