package inheritance_Hierarchical;

public class Dog extends Animals{ // Sub class Dog 

	public void sound1()
	{
		System.out.println("Dogs make sound Booowww");
	}
	public static void main(String[] args) {
	Dog d = new Dog();
	d.drink();
	d.eats();
	d.sound1();
	}
}
