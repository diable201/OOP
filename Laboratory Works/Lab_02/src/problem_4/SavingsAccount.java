package problem_4;

public class SavingsAccount extends Account {
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public SavingsAccount(int a, int interestRate) {
        super(a);
        this.interestRate = interestRate;
    }

    public void addInterestRate() {
        super.deposit(this.getBalance() * interestRate / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " Interest Rate: " + getInterestRate() + "%";
    }
}
