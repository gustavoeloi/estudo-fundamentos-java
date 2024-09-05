package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDates {
    public static void main(String[] args) {

        // Criando um Pattern para formatar uma data de acordo com o texto
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Instanciando Data (LocalDate) e Data e Hora (LocalDateTime)
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        // Instanciando uma Data com horário global
        Instant horarioGB = Instant.now();

        Instant horarioGB1 = Instant.parse("2022-02-08T01:30:00Z");

        // Passando um texto para um objeto LocalDate
        LocalDate d03 = LocalDate.parse("2024-08-07");

        // Formatando um texto para um objeto LocalDate de acordo com um pattern
        LocalDate d04 = LocalDate.parse("20/08/2024", fmt1);
        LocalDate d05 = LocalDate.parse("08/07/2004 08:15", fmt2);

        // Criando um Objeto LocalDate a partir de dados específicos como: ano, mês e dia;
        LocalDate d06 = LocalDate.of(2004, 8, 07);
        LocalDateTime d07 = LocalDateTime.of(2004, 8, 07, 23, 5, 0);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);

        System.out.println(horarioGB);
        System.out.println(horarioGB1);
    }
}
