package exAula165.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {}

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double calculateTax() {
        double tax = 0;
        if (getAnnualIncome() < 20000) {
            tax += getAnnualIncome() * 0.15;
        } else {
            tax += getAnnualIncome() * 0.25;
        }

        if (getHealthExpenditures() > 0) {
            tax -= getHealthExpenditures() * 0.5;
        }

        return tax;
    }
}
