class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate;

    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }

    double calculateInterest() {
        return balance * interest_rate / 100;
    }

    void display() {
        System.out.println("Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }
}

public class Pr10 {
    public static void main(String[] args) {
        BankAccount.updateInterestRate(5);

        BankAccount b1 = new BankAccount("Alice", 10000);
        BankAccount b2 = new BankAccount("Bob", 20000);

        b1.display();
        System.out.println();
        b2.display();

        BankAccount.updateInterestRate(7);
        System.out.println("\nAfter updating interest rate:");

        b1.display();
        System.out.println();
        b2.display();
    }
}

/*
Output:
Name: Alice
Balance: 10000.0
Interest Earned: 500.0

Name: Bob
Balance: 20000.0
Interest Earned: 1000.0

After updating interest rate:
Name: Alice
Balance: 10000.0
Interest Earned: 700.0

Name: Bob
Balance: 20000.0
Interest Earned: 1400.0
*/
