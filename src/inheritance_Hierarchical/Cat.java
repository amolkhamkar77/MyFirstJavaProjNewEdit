package inheritance_Hierarchical;

public class Cat extends Animals{ // Sub class cat

	public void sound()
	{
		System.out.println("Cat make sound Meooowwww");
	}
	public static void main(String[] args) {
		Cat a = new Cat();
		a.eats();
		a.drink();
		a.sound();
	}
}

