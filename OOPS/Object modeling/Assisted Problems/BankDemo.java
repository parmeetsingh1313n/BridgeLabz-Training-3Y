import java.util.*;

// Customer class
class Customer {
    String name;
    int customerId;
    double balance;

    Customer(String name, int id) {
        this.name = name;
        this.customerId = id;
        this.balance = 0;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}

// Bank class
class Bank {
    String bankName;
    ArrayList<Customer> customers;

    Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    void openAccount(Customer c, double amount) {
        c.balance = amount;
        customers.add(c);
        System.out.println("Account opened for " + c.name + " with " + amount + " in " + bankName);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank b = new Bank("SBI");

        Customer c1 = new Customer("Anuj", 101);
        Customer c2 = new Customer("Parmeet", 102);

        b.openAccount(c1, 5000);
        b.openAccount(c2, 8000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
