package aula113;

import javax.print.attribute.IntegerSyntax;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate data = LocalDate.parse("2023-04-25");
        LocalDateTime dataHora = LocalDateTime.parse("2023-04-25T19:20:32");
        Instant dataGlobal = Instant.parse("2023-04-25T19:20:32Z");

        LocalDate semanaPassada = data.minusDays(7);
        LocalDate proxSemana = data.plusDays(7);

        // System.out.println(semanaPassada);
        // System.out.println(proxSemana);

        LocalDateTime cincoHoras = dataHora.plusHours(5);
        // System.out.println(cincoHoras);

        // é passado a quantidade e a unidade (dias, horas etc) com o objeto ChronoUnit
        Instant ontem = dataGlobal.minus(1, ChronoUnit.DAYS);
        Instant amanha = dataGlobal.plus(1, ChronoUnit.DAYS);
        // System.out.println(ontem);
        // System.out.println(amanha);

        // o Duration não suporta LocalDate, então devemos usar o método atStartOfDay para usar o horário a meia noite
        Duration duracaoDias = Duration.between(semanaPassada.atStartOfDay(), data.atStartOfDay());
        Duration duracaoHoras = Duration.between(dataHora, cincoHoras);
        Duration duracaoOntem = Duration.between(dataGlobal, ontem);

        System.out.println(duracaoDias.toDays());
        System.out.println(duracaoHoras.toHours());
        System.out.println(duracaoOntem.toHours());
    }
}
