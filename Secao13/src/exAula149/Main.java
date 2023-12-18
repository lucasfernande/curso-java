package exAula149;

import exAula149.entities.Department;
import exAula149.entities.HourContract;
import exAula149.entities.Worker;
import exAula149.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base salary: ");
        double workerSalary = Double.parseDouble(sc.nextLine());

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker?: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter contract #%d data: %n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            String date = sc.nextLine();
            LocalDate contractDate = LocalDate.parse(date, dateFmt);

            System.out.print("Value per hour: ");
            double contractValueHour = Double.parseDouble(sc.nextLine());

            System.out.print("Duration (hours): ");
            int contractHours = Integer.parseInt(sc.nextLine());

            worker.addContract(new HourContract(contractDate, contractValueHour, contractHours));
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (DD/YYYY): ");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + worker.income(month, year));

        sc.close();
    }
}
