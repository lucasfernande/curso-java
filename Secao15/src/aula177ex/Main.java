package aula177ex;

import aula177ex.model.entities.Account;
import aula177ex.model.exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data: ");
            System.out.print("\nNumber: ");
            int number = Integer.parseInt(sc.nextLine());
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: $ ");
            double balance = Double.parseDouble(sc.nextLine());
            System.out.print("Withdraw limit: $ ");
            double withdrawLimit = Double.parseDouble(sc.nextLine());

            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            double amount = Double.parseDouble(sc.nextLine());

            acc.withdraw(amount);
            System.out.println("New balance: $ " + acc.getBalance());
        }
        catch (WithdrawException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
