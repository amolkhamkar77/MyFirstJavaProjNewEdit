package interfacePackage;

public class ImGoingToRoom {

	public static void main(String[] args) {
		System.out.println("As Im entering in Hall");
		Hall h = new Hall();
		h.tubelightInHall();
		h.tubelightInKitchen();
		
		System.out.println("As Im entering in Kitchen");
		//Kitchen k = new Kitchen();
		//k.tubelightInHall();
		//k.tubelightInKitchen();
            
		       //OR
		Tubelight t =new Kitchen(); // second way of calling method, by taking reference variable of Interface
		t.tubelightInHall();
		t.tubelightInKitchen();
	}

}
