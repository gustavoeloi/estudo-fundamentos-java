package application;

import model.entities.Account;
import model.exception.WithdrawException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = scanner.nextInt();
            System.out.print("Holder: ");
            String holder = scanner.next();
            System.out.print("Initial balance: $");
            double initialBalance = scanner.nextDouble();
            System.out.print("Withdraw limit: $");
            double withdrawLimit = scanner.nextDouble();

            Account acc = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.print("Enter amount for withdraw: $");
            double amountWithdraw = scanner.nextDouble();
            acc.withdraw(amountWithdraw);

            System.out.println("New balance: " + acc.getBalance());
        } catch(WithdrawException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch(InputMismatchException e) {
            System.out.println("Invalid data input");
        }

        scanner.close();
    }
}
