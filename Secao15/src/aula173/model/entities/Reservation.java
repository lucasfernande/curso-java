package aula173.model.entities;

import aula173.model.exceptions.DomainException;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        Duration duration = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());
        if (duration.toDays() < 0) {
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public long duration() {
        Duration duration = Duration.between(this.checkIn.atStartOfDay(), this.checkOut.atStartOfDay());
        return duration.toDays();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) {
        LocalDate now = LocalDate.now();
        Duration duration = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());
        Duration durationCheckInAndNow = Duration.between(now.atStartOfDay(), checkIn.atStartOfDay());
        Duration durationCheckOutAndNow = Duration.between(now.atStartOfDay(), checkOut.atStartOfDay());

        if (durationCheckInAndNow.toDays() < 0 || durationCheckOutAndNow.toDays() < 0) {
            throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
        } else if (duration.toDays() < 0) {
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "Room: " + this.roomNumber +
                ", check-in: " + this.checkIn.format(dateFormat) +
                ", check-out: " + this.getCheckOut().format(dateFormat) +
                ", duration: " + duration() +
                " nights";
    }
}
