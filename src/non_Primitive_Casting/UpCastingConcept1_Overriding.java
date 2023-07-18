package non_Primitive_Casting;

public class UpCastingConcept1_Overriding {
// concept1  where overriding take place
	
	public static void main(String[] args) {
		
//Shark s = new Shark(); ...(just try different thing)
//s.nature();
		
	// SYNTAX	
	//SuperClass Ref Var = new subClass();
		Animal a = new Shark();// upCasting
		a.nature(); //there is only child class on right side of equal sign...i.e dont write parent/Super class on right side 
		System.out.println(a.name);
 //just keep in mind... SUPER CLASS = SUB CLASS
 // Remaing procedure is same
// with overriding me Subclass ki property call hui
	}
}
