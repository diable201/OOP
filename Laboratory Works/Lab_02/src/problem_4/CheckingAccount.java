package problem_4;

public class CheckingAccount extends Account {
    private final double fee = 0.02;
    private int numberOfTransactions;
    private final int numberOfFreeTransactions = 5;

    public CheckingAccount(int a) {
        super(a);
        numberOfTransactions = 0;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public int getNumberOfFreeTransactions() {
        return numberOfFreeTransactions;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public void deposit(double sum) {
        if (numberOfTransactions < 5) {
            super.deposit(sum);
            numberOfTransactions++;
        } else {
            super.deposit(sum);
            deductFee();
        }
    }

    @Override
    public void withdraw(double sum) {
        if (numberOfTransactions < 5) {
            super.withdraw(sum);
            numberOfTransactions++;
        } else if (super.getBalance() - fee >= sum ) {
            super.withdraw(sum);
            deductFee();
        } else {
            System.out.println("The transaction was cancelled. Insufficient funds in the account.");
        }
    }

    @Override
    public void transfer(double amount, Account other) {
        if (numberOfTransactions < 5) {
            super.transfer(amount, other);
            numberOfTransactions++;
        } else if (super.getBalance() - fee >= amount) {
            super.transfer(amount, other);
            deductFee();
        } else {
            System.out.println("The transaction was cancelled. Insufficient funds in the account.");
        }
    }

    public void deductFee() {
        if (numberOfTransactions >= numberOfFreeTransactions) {
            super.withdraw(fee);
            numberOfTransactions++;
        } else {
            System.out.println("You have free transactions!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Transactions: " + getNumberOfTransactions() +
                " Initial value of free transactions: " + getNumberOfFreeTransactions()
                + " Fee: " + getFee();
    }
}
