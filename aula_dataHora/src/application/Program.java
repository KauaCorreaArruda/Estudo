package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		// Data atual local
		LocalDate d01 = LocalDate.now();

		// Data e horário atuais locais
		LocalDateTime d02 = LocalDateTime.now();

		// Data e horário atuais padrão ISO8601
		Instant d03 = Instant.now();

		// Data local no padrâo ISO8601
		LocalDate d04 = LocalDate.parse("2024-08-14");

		// Data e horário locais no padrão ISO8601
		LocalDateTime d05 = LocalDateTime.parse("2024-08-14T04:20:01");

		// Data e horário UTC no padrão ISO8601
		Instant d06 = Instant.parse("2024-08-14T04:20:01Z");

		// Data e horário UTC no padrão ISO8601 com o fuso-horário GMT-03:00(SP)
		Instant d07 = Instant.parse("2024-08-14T04:20:01-03:00");

		// Data em formato customizado
		LocalDate d08 = LocalDate.parse("14/08/2024", fmt1);

		// Data e hora em formato customizado
		LocalDateTime d09 = LocalDateTime.parse("14/08/2024 14:00", fmt2);

		// Datas e horários customizados podem receber a expressão do padrão de
		// formatação dentro do próprio argumento, ex:
		LocalDateTime d10 = LocalDateTime.parse("14/08/2024 14:01", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

		// Dia, mês, e ano passados separadamente utilizando "LocalDate.of"
		LocalDate d11 = LocalDate.of(2024, 8, 14);

		// Dia, mês, ano, e horário passados separadamente utilizando "LocalDate.of"
		LocalDateTime d12 = LocalDateTime.of(2024, 8, 14, 14, 52);

		System.out.println("d01= " + d01);
		System.out.println("d02= " + d02);
		System.out.println("d03= " + d03);
		System.out.println("d04= " + d04);
		System.out.println("d05= " + d05);
		System.out.println("d06= " + d06);
		System.out.println("d07= " + d07);
		System.out.println("d08= " + d08);
		System.out.println("d09= " + d09);
		System.out.println("d10= " + d10);
		System.out.println("d11= " + d11);
		System.out.println("d12= " + d12);

	}

}