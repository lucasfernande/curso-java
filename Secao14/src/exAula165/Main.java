package exAula165;

import exAula165.entities.Company;
import exAula165.entities.Individual;
import exAula165.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.printf("Tax payer #%d data: %n", i);

            System.out.print("Individual or company (i/c)?: ");
            char taxPayerType = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String taxPayerName = sc.nextLine();

            System.out.print("Annual income: ");
            double taxPayerAnnualIncome = Double.parseDouble(sc.nextLine());

            if (taxPayerType == 'i') {
                System.out.print("Health expenditures: ");
                double taxPayerHealthExpenditures = Double.parseDouble(sc.nextLine());

                list.add(new Individual(taxPayerName, taxPayerAnnualIncome, taxPayerHealthExpenditures));
            } else if (taxPayerType == 'c') {
                System.out.print("Number of employees: ");
                int taxPayerNumberOfEmployees = Integer.parseInt(sc.nextLine());

                list.add(new Company(taxPayerName, taxPayerAnnualIncome, taxPayerNumberOfEmployees));
            }
        }

        double totalTaxes = 0;

        System.out.println("TAXES PAID");
        for (TaxPayer taxPayer : list) {
            System.out.println(taxPayer.toString());
            totalTaxes += taxPayer.calculateTax();
        }

        System.out.println("TOTAL TAXES: $ " + totalTaxes);

        sc.close();
    }
}
