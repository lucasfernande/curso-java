package aula110;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        /*
            Data hora local -> LocalDate e LocalDateTime
            Data hora global -> Instant
            Duração -> Duration
            Outros -> ZoneId e ChronoUnit
         */

        LocalDate data = LocalDate.now();
        LocalDateTime dataHora = LocalDateTime.now();
        Instant dataGlobal = Instant.now();

        System.out.println("Data: " + data);
        System.out.println("Data e hora: " + dataHora);
        System.out.println("Data com fuso horário: " + dataGlobal); // Z -> Horário de Londres
    }
}
