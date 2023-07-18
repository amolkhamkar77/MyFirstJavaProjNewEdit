package PracticePrograms;

public class nestedifstat {

	public static void main(String[] args) {
		int age =19;
		int weight = 42;
		if(age>=18)
		{
			System.out.println("condition of age  is valide");
			
			if(weight>=45)
			{
				System.out.println("condition of weight is valid");
				System.out.println("your eligible to donate the bllod");
			}
			
		}
		else
		{
			System.out.println("your not eligible to donate the blood");
		}

	}

}
