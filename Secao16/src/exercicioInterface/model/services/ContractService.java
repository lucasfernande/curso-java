package exercicioInterface.model.services;

import exercicioInterface.model.entities.Contract;
import exercicioInterface.model.entities.Installment;
import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months) {
        double installmentValue = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            double interest = paymentService.interest(installmentValue, i);
            double paymentFee = paymentService.paymentFee(installmentValue + interest);

            LocalDate dueDate = contract.getDate().plusMonths(i);
            Installment installment = new Installment(dueDate, installmentValue + interest + paymentFee);

            contract.addInstallment(installment);
        }
    }
}
