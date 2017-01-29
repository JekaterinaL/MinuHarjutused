package Bank;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public class BankMain {

    public static void main(String[] args) {

        //Create cust1
        Account cust1 = new Account();  //Create an account object
        cust1.deposit(500);

        //Create cust2
        Account cust2 = new Account();
        cust2.deposit(100);
        cust2.withdraw(400);

        System.out.print("Cust1 has a balance of ");
        System.out.println(cust1.getBalance());

        System.out.print("Cust2 has a balance of ");
        System.out.println(cust2.getBalance());
    }
}
