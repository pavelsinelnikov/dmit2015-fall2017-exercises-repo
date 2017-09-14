package exercise03;

public abstract class BankAccount {
	
	protected int accountNo;
	protected String owner;
	protected double balance;
	
	public void deposit (double amount)
	{
		if (amount > 0)
		{
			balance += amount;
		}
	}
	
	public abstract void withdraw (double amount);

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
