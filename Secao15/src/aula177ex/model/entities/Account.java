package aula177ex.model.entities;

import aula177ex.model.exceptions.WithdrawException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {}

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        validateWithdraw(amount);
        this.balance -= amount;
    }

    public void validateWithdraw(double amount) {
        if (amount > this.withdrawLimit) {
            throw new WithdrawException("Withdraw error: the amount exceeds withdraw limit");
        }

        if (amount < this.withdrawLimit && amount > this.balance) {
            throw new WithdrawException("Withdraw error: not enough balance");
        }
    }
}
