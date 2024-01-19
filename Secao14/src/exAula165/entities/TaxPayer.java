package exAula165.entities;

public abstract class TaxPayer {
    private String name;
    protected Double annualIncome;

    public TaxPayer() {}

    public TaxPayer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    @Override
    public String toString() {
        return getName() + ": $ " + String.format("%.2f", calculateTax());
    }

    public abstract Double calculateTax();
}
