package Aug27;

public class Account {

	private double depositAmount;	
	private String accountHolderName;
	private double balance;	
	private double withdrawAmount;

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {

		this.balance = balance;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public Account(String accountHolderName, double balance){
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		}
	
	public double deposit(double depositAmount) {
		return balance += depositAmount;	
	}
	
	public void withdraw(double withdrawAmount) {
		if(withdrawAmount>balance) {
			System.out.println("insufficient balance, cannot withdraw");
		}
		else {
		System.out.println(balance -= withdrawAmount) ;
		}
	}
	
	@Override
	public String toString() {
		return 
				"\nAccount Holder Name: "
				+ accountHolderName + "\nBalance: " + balance ;
	}
	
	


}

