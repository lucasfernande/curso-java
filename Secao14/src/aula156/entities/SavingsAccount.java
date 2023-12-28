package aula156.entities;


// a palavra final evita que a classe SavingsAccount seja herdada, e também serve para evitar que métodos sejam sobrepostos
public final class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        deposit(this.getBalance() * interestRate);
    }
}
