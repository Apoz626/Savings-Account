import java.util.Scanner;

public class SavingsAccountDemo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		SavingsAccount account1;

		double balance;
		double interestRate;
		int months;
		double deposit;
		double withdrawal;

		System.out.println("Enter your starting balance: ");
		balance = scnr.nextDouble();

		scnr.nextLine();

		System.out.println("Enter the Yearly Interest Rate: ");
		interestRate = scnr.nextDouble();

		account1 = new SavingsAccount(balance, interestRate);

		System.out.println("How many months have passed?");
		months = scnr.nextInt();

		for (int i = 1; i <= months; ++i) {
			System.out.println("How much was deposited during month " + i + "?");
			deposit = scnr.nextDouble();
			account1.deposit(deposit);

			scnr.nextLine();

			System.out.println("How much was withdrawn during month " + i + "?");
			withdrawal = scnr.nextDouble();
			account1.withdrawal(withdrawal);

			System.out.printf("Monthly Interest: $%.2f", account1.calculateInterest(deposit - withdrawal));
			System.out.println();
		}

		System.out.println();

		System.out.printf("Total Balance: $%.2f", account1.totalBalance());
		System.out.println();
		System.out.printf("Total Deposited: $%.2f", account1.totalDeposit());
		System.out.println();
		System.out.printf("Total Withdrawn: $%.2f", account1.totalWithdrawl());
		System.out.println();
		System.out.printf("Total Interest Earned: $%.2f", account1.totalInterest());

	}

}
