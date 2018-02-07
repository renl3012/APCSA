package unit2;

public class SavingsAccount {
	private double balance;
	private double interest;
    /**
     * Constructs a bank account with a zero balance.
     */
    public SavingsAccount()
    {
        balance = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     *
     * @param initialBalance the initial balance
     */
    public SavingsAccount(double initialBalance, double initialInterest)
    {
        balance = initialBalance;
        interest = balance*initialInterest;
    }
    public void addInterest(){
    	balance += interest;
    }
    /**
     * Gets the current balance of the bank account.
     *
     * @return the current balance
     */

    public void print(){
    	System.out.println("Balance: " + balance);
    }
}