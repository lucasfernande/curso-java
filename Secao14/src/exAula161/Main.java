package exAula161;

import exAula161.entities.Employee;
import exAula161.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> emps = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = Integer.parseInt(sc.nextLine());


        for (int i = 1; i <= n; i++) {
            System.out.printf("Employee #%d data:%n", i);

            System.out.print("Outsourced (y/n)?: ");
            char isOutSourced = sc.nextLine().toLowerCase().charAt(0);

            System.out.print("Name: ");
            String empName = sc.nextLine();

            System.out.print("Hours: ");
            int empHours = Integer.parseInt(sc.nextLine());

            System.out.print("Value per hour: ");
            double empValuePerHour = Double.parseDouble(sc.nextLine());

            if (isOutSourced == 'y') {
                System.out.print("Additional charge: ");
                double empAdditionalCharge = Double.parseDouble(sc.nextLine());

                emps.add(new OutsourcedEmployee(empName, empHours, empValuePerHour, empAdditionalCharge));
            } else {
                emps.add(new Employee(empName, empHours, empValuePerHour));
            }
        }

        System.out.println("\nPAYMENTS: ");
        for (Employee emp: emps) {
            System.out.println(emp.getName() + " - $ " + emp.payment());
        }

        sc.close();
    }
}
