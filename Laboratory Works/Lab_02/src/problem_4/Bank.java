package problem_4;
import java.util.Vector;

public class Bank {
    private static Vector<Account> accounts = new Vector<>();

    public static void main(String[] args) {
        openAccount(new CheckingAccount(101));
        openAccount(new SavingsAccount(200, 5));
        openAccount(new Account(305));
        Account testAccount = new CheckingAccount(156);
        closeAccount(testAccount);
        update();
    }

    public Bank(Vector<Account> accounts) {
        Bank.accounts = accounts;
    }

    public static void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account was opened");
    }

    public static void closeAccount(Account account) {
        accounts.remove(account);
        System.out.println("Account was closed");
    }

    public static void update() {
        for (Account account : accounts) {
            account.deposit(1300);
            account.withdraw(100);
            account.withdraw(100);
            account.withdraw(100);
            account.withdraw(100);
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterestRate();
            } else if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).deductFee();
            }
            account.print();
        }
    }
}
