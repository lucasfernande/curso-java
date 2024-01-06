package aula163.entities;

// a classe BusinessAccount herda todos os atributos e métodos da superclasse Account
public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {}

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            deposit(amount - 10.0);
        }
    }
}
