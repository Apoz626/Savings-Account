public class SavingsAccount {
	private double balance;
	private double interestRate;
	private double totalWithdrawl = 0;
	private double totalDeposit = 0;
	private double newBalance = 0;
	private double totalInterest = 0;

	public SavingsAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void deposit(double amount) {
		totalDeposit += amount;
		balance += amount;
	}

	public void withdrawal(double amount) {
		if (amount > balance) {
			System.out.println("Invalid Funds");
		}

		else {
			totalWithdrawl += amount;
			balance -= amount;
		}
	}

	public double calculateInterest(double deposit) {
		newBalance = (interestRate / 12) * deposit;

		balance += newBalance;

		totalInterest += newBalance;

		return newBalance;
	}

	public double totalWithdrawl() {
		return totalWithdrawl;
	}

	public double totalDeposit() {
		return totalDeposit;
	}

	public double totalInterest() {
		return totalInterest;
	}

	public double totalBalance() {
		return balance;
	}
}
