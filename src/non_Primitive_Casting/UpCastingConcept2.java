package non_Primitive_Casting;

public class UpCastingConcept2 {
// concept2  without overriding method
	public static void main(String[] args) {
	
		// SYNTAX	
		//SuperClass Ref Var = new subClass();
		 Father f = new Son();
		 
		// Son d= (Son)f;   used for DownCasting Purpose
		 f.home();
		 f.farm();
		 System.out.println(f.age);// Variable calling
		 
//just keep in mind... SUPER CLASS = SUB CLASS
	// Remaing procedure is same
   // without overriding me SuperClass ki property call hui
	}

}
