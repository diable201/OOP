package problem_4;

public class Account {
    private double balance;
    private final int accountNumber;

    public Account(int a) {
        balance = 0.0;
        accountNumber = a;
    }

    public void deposit(double sum) {
        balance += sum;
        System.out.println("The transaction was successful.");
    }

    public void withdraw(double sum) {
        if (sum > balance) {
            System.out.println("Transaction was cancelled.");
        } else {
            balance -= sum;
            System.out.println("The transaction was successful.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void transfer(double amount, Account other) {
        if (this.balance < amount) {
            System.out.println("The transaction was cancelled. Insufficient funds in the account.");
        } else {
            this.withdraw(amount);
            other.deposit(amount);
            System.out.println("The transaction was successful.");
        }
    }

    @Override
    public String toString() {
        return "Account number: " + getAccountNumber() + " Balance: " + getBalance();
    }

    public final void print() {
        System.out.println(toString());
    }
}
