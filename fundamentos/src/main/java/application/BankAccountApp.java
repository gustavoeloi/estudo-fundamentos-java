package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter with account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter the name of the account holder:  ");
        String accountHolder = scanner.next();

        BankAccount account = new BankAccount(accountNumber, accountHolder);

        System.out.print("Is there an Initial Deposit (y/n)? ");
        String hasInitialDeposit = String.valueOf(scanner.next().charAt(0));

        if(hasInitialDeposit.contains("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialValue = scanner.nextDouble();
           account.deposit(initialValue);
        }

        System.out.println(account);

        System.out.print("Make a deposit into the account: $");
        account.deposit(scanner.nextDouble());

        System.out.println(account);

        System.out.print("Make a withdrawal from the account: $ ");
        account.withdrawalBalance(scanner.nextDouble());

        System.out.println(account);
        scanner.close();
    }
}
