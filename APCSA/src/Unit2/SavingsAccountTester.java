package unit2;

public class SavingsAccountTester {

	public static void main(String[] args) {
		SavingsAccount mySavingsAccount = new SavingsAccount(1000,0.10);
		mySavingsAccount.addInterest();
		mySavingsAccount.print();
	}

}
