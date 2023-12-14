package aula112;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate data = LocalDate.parse("2023-10-04");
        LocalDateTime dataHora = LocalDateTime.parse("2023-10-04T08:15:40");
        Instant dataGlobal = Instant.parse("2023-10-04T08:15:40Z"); // horário de Londres

        // ZoneId.getAvailableZoneIds(); -> retorna todos os fusos horários que podemos usar

        LocalDateTime dataBrasil = LocalDateTime.ofInstant(dataGlobal, ZoneId.systemDefault()); // 3 horas a menos
        LocalDateTime dataPortugal = LocalDateTime.ofInstant(dataGlobal, ZoneId.of("Portugal")); // 1 hora a mais

        System.out.println(dataBrasil);
        System.out.println(dataPortugal);
    }
}
