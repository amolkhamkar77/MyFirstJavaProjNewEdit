package logicalPrograms;

public class Replace_Multiple_Special_Character {

	public static void main(String[] args) {
		String name = "V@ai@bh#av";
		
		//method1
		String CorrectName = name.replaceAll("[^a-zA-Z]", ""); // Except a-z and A-Z
		System.out.println(CorrectName);
		
		//method2
		System.out.println(name.replace("@", "").replace("#", ""));
		}
}
