package aula156;

import aula156.entities.Account;
import aula156.entities.BusinessAccount;
import aula156.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        Account bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
        Account sacc = new SavingsAccount(1003, "Bob", 100.0, 0.1);

        // upcasting -> casting da subclasse para superclasse
        Account accTeste = bacc; // isso é possível devido a BusinessAccount ser também uma Account

        // downcasting -> casting da superclasse para subclasse
        BusinessAccount baccTeste = (BusinessAccount) accTeste; // nesse caso é necessário fazer o casting manual

        // BusinessAccount saccTeste = (BusinessAccount) sacc; // isso não é possível, pois a SavingsAccount não é uma BusinessAccount

        if (sacc instanceof BusinessAccount) {
            BusinessAccount saccTeste = (BusinessAccount) sacc;
            saccTeste.loan(200.0);
            System.out.println("Loan!");
        }

        if (sacc instanceof SavingsAccount) {
            SavingsAccount saccTeste = (SavingsAccount) sacc;
            saccTeste.updateBalance();
            System.out.println("Update!");
        }

    }
}
