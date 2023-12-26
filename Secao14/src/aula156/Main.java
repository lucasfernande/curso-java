package aula156;

import aula156.entities.BusinessAccount;

public class Main {
    public static void main(String[] args) {
        BusinessAccount account = new BusinessAccount();
        account.getBalance();

        // o método getBalance foi definido apenas na classe Account, então a BusinessAccount herdou ele
    }
}
