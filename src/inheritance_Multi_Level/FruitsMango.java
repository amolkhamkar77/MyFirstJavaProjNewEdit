package inheritance_Multi_Level;

public class FruitsMango extends Flowering {

	public void Fruits()
	{
		System.out.println("There are too many mangoes on Mango tree");
	}
	public static void main(String[] args) {
		FruitsMango M = new FruitsMango();
		M.plantation();
		M.flowering();
		M.Fruits();
		

	}

}
