// Superclass
class BankAccount {
    int accountNo;
    double balance;

    BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("This is a general bank account.");
    }
}

// Subclass: Savings Account
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Savings Account with interest rate: " + interestRate + "%");
    }
}

// Subclass: Checking Account
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNo, double balance, double withdrawalLimit) {
        super(accountNo, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Checking Account with withdrawal limit: " + withdrawalLimit);
    }
}

// Subclass: Fixed Deposit
class FixedDepositAccount extends BankAccount {
    int lockPeriod;

    FixedDepositAccount(int accountNo, double balance, int lockPeriod) {
        super(accountNo, balance);
        this.lockPeriod = lockPeriod;
    }

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account locked for " + lockPeriod + " months.");
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(101, 5000, 4.5);
        BankAccount acc2 = new CheckingAccount(102, 8000, 2000);
        BankAccount acc3 = new FixedDepositAccount(103, 20000, 12);

        acc1.displayAccountType();
        acc2.displayAccountType();
        acc3.displayAccountType();
    }
}
