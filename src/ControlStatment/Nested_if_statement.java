package ControlStatment;

public class Nested_if_statement {

	public static void main(String[] args) {
		System.out.println("Welcome to the Blood donation Camp");
		int age=25;        // input age
		int weight = 55;    // input weight
		if (age>= 20){// condition 1
		{
			
		System.out.println("condition 1 age is satisfied" );
		}
		
if (weight>45) // condition 2
{
	System.out.println("codition 2 weight is satisfied");

	System.out.println("your eligile to donate  Blood");
}
}
else   // when both the conditions will satisfied then only u can donate the blood
{
	System.out.println("your age & weight is not suitable for donate the blood");
}

	}

}
