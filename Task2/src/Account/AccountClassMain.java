package Account;

import java.util.Scanner;

public class AccountClassMain extends Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an account using the no-argument constructor
        Account account1 = new Account();

        System.out.print("Enter initial balance for the  account: ");
        double initialBalance = scanner.nextDouble();
        Account account2 = new Account(initialBalance, account1.accountNumber);

        //deposit and withdraw operations


        account2.depositAmount(200);
        account2.withdrawAmount(10);


        //Displaying the balance in both accounts

        account2.display();
    }
}
