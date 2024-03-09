package aula173;

import aula173.model.entities.Reservation;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = Integer.parseInt(sc.nextLine());

        System.out.print("Check-in date (dd/mm/yyyy): ");
        LocalDate checkIn = LocalDate.parse(sc.nextLine(), dateFormat);

        System.out.print("Check-out date (dd/mm/yyyy): ");
        LocalDate checkOut = LocalDate.parse(sc.nextLine(), dateFormat);

        Duration duration = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());

        if (duration.toDays() < 0) { // se a data de check in for superior a data de check out, não podemos instanciar o objeto
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("Enter data to update the reservation: ");

            System.out.print("Check-in date (dd/mm/yyyy): ");
            checkIn = LocalDate.parse(sc.nextLine(), dateFormat);
            System.out.print("Check-out date (dd/mm/yyyy): ");
            checkOut = LocalDate.parse(sc.nextLine(), dateFormat);

            String error = reservation.updateDates(checkIn, checkOut);

            if (error != null) {
                System.out.println(error);
            } else {
                System.out.println(reservation);
            }
        }

        sc.close();
    }
}
