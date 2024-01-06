package aula163;

import aula163.entities.Account;
import aula163.entities.BusinessAccount;
import aula163.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        // uma classe abstrata não pode ser instanciada, apenas suas subclasses
        // as vantagens das classes abstratas são reuso e polimorfismo

        // Account acc = new Account(1001, "Bob", 150.0);

        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        list.add(new BusinessAccount(1000, "Alex", 100.00, 70.0));
        list.add(new SavingsAccount(1001, "Maria", 250.00, 0.1));

        double totalBalance = 0;
        for (Account acc : list) {
            totalBalance += acc.getBalance();
        }

        System.out.println("Total balance: $ " + totalBalance);

        for (Account acc : list) {
            acc.deposit(10);
        }

        for (Account acc : list) {
            System.out.printf("Account %d balance updated: $ %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}
