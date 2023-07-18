package EnCapsulation;

public class UpdateAndCheckBalance {

	public static void main(String[] args) {
		
		AccountBalance a = new AccountBalance();
		System.out.println(a.getbalanc());
		a.setbalance(11000.5);
		System.out.println(a.getbalanc());
		a.setbalance(110);
		System.out.println(a.getbalanc());
	}

}
