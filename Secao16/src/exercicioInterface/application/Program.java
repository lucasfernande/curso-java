package exercicioInterface.application;

import exercicioInterface.model.entities.Contract;
import exercicioInterface.model.entities.Installment;
import exercicioInterface.model.services.ContractService;
import exercicioInterface.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        int number = Integer.parseInt(sc.nextLine());

        System.out.print("Date (dd/mm/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

        System.out.print("Contract value: ");
        double totalValue = Double.parseDouble(sc.nextLine());

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Enter the number of installments: ");
        int installmentsQtt = Integer.parseInt(sc.nextLine());

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installmentsQtt);

        for (Installment i : contract.getInstallments()) {
            System.out.println(i.getDueDate().format(fmt) + ", $" + i.getAmount());
        }

        sc.close();
    }
}
