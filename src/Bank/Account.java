package Bank;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public class Account {

    private double balance;

    // Set balance to 0.00
    public Account() {
        balance = 0.0;
    }
    //Deposit
    public void deposit(double amount) {
        balance = balance + amount;
    }
    //Withdraw
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.err.println("Transaction cancelled due to insufficient funds");
        }

    }
    //Get Balance
    public double getBalance() {
        return balance;
    }
}
