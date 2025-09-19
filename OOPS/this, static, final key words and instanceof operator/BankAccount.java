class BankAccount {
    // static variable --> shared by all objects
    static String bankName = "SBI";
    static int totalAccounts = 0;

    // final --> value cant change
    private final int accountNumber;
    private String accountHolderName;

    BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    // instance method
    void displayDetails() {
        // using instanceof to check safety
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Account No: " + accountNumber + ", Holder: " + accountHolderName);
        }
    }

    // static method..
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
    
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(101, "Raj");
        BankAccount a2 = new BankAccount(102, "Parmeet");
        a1.displayDetails();
        a2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
