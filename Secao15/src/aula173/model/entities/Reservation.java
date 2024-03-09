package aula173.model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation() {}

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
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
