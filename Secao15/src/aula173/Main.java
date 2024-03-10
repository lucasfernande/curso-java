package aula173;

import aula173.model.entities.Reservation;
import aula173.model.exceptions.DomainException;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        try {
            System.out.print("Room number: ");
            int number = Integer.parseInt(sc.nextLine());

            System.out.print("Check-in date (dd/mm/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.nextLine(), dateFormat);

            System.out.print("Check-out date (dd/mm/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.nextLine(), dateFormat);

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/mm/yyyy): ");
            checkIn = LocalDate.parse(sc.nextLine(), dateFormat);
            System.out.print("Check-out date (dd/mm/yyyy): ");
            checkOut = LocalDate.parse(sc.nextLine(), dateFormat);

            reservation.updateDates(checkIn, checkOut);
            System.out.println(reservation);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
