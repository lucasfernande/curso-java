package aula111;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate data = LocalDate.parse("2023-12-14");
        LocalDateTime dataHora = LocalDateTime.parse("2023-12-14T14:30");
        Instant dataGlobal = Instant.parse("2023-12-14T14:30:50Z");

        DateTimeFormatter fmtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmtDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmtDataGlobal = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        // pegando o fuso horário do computador do usuário

        System.out.println(data.format(fmtData)); // também pode ser fmtData.format(data)
        System.out.println(dataHora.format(fmtDataHora));

        System.out.println(fmtDataGlobal.format(dataGlobal)); // o Instant não tem o método format, então devemos chamar pelo DateTimeFormatter
    }
}
