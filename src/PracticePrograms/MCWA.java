package PracticePrograms;

public class MCWA {
	public static void mobile()
	{
		System.out.println(" i have a mobile");
	}
public void laptop(int a)
{
	System.out.println("i have laptop");
}
public void computer(String g)
{
	System.out.println("i have computer");
}
	public static void main(String[] args) {
		
		MCWA abc = new MCWA();
		abc.laptop(5);
		abc.computer("HP");
		MCWA.mobile();
	}

}
