package EnCapsulation;

public class AccountBalance {
private double balance;// private is access modifier scope is within class
// double is data type used for fractional or decimal values... account balance is in decimal point
// balance is the variable

public void setbalance(double balance) {// method with argument
	this.balance= this.balance + balance; // this keword is used because of Global and Local Variable
}						//setbalance is used to view the balance

public double getbalanc() {// getbalance is used for modified the balance
	return balance;
}
}
