package aula110;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

        // Criando objetos data a partir de textos

        LocalDate dataTexto = LocalDate.parse("2021-11-27");
        LocalDateTime dataHoraTexto = LocalDateTime.parse("2021-11-27T19:05:21");
        Instant dataGlobalTexto = Instant.parse("2021-11-27T19:05:21Z");
        Instant dataGlobalConvertida = Instant.parse("2021-11-27T19:05:21-03:00"); // adiciona 3 horas, ou seja, horário de Londres

        System.out.println(dataTexto);
        System.out.println(dataHoraTexto);
        System.out.println(dataGlobalTexto);
        System.out.println(dataGlobalConvertida);

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // colocando uma data no formato brasileiro
        LocalDate dataBrasil = LocalDate.parse("28/01/2023", formato1);
        System.out.println(dataBrasil);

        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataHoraBr = LocalDateTime.parse("08/08/2020 18:30", formato2);
        System.out.println(dataHoraBr);
    }
}
