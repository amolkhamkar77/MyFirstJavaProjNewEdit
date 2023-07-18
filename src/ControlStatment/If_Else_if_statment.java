package ControlStatment;

public class If_Else_if_statment {

	public static void main(String[] args) {
		int money = 25000;// By changing the option of money, u can check the output
if (money > 3000 && money <= 10000)
{
	System.out.println("I will Buy Smart phone");
}
else if(money >10000 && money <= 30000)
{
	System.out.println("I will buy Bicycle");
}
else if (money > 30000 && money<= 100000)
{
	System.out.println("i will buy laptop");
}
else
{
	System.out.println("Insufficent money");
}
	}

}
