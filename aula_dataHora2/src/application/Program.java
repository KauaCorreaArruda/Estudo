package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// FORMATAÇÃO
		LocalDate d04 = LocalDate.parse("2024-08-15");
		LocalDateTime d05 = LocalDateTime.parse("2024-08-15T09:21:38");
		Instant d06 = Instant.parse("2024-08-15T12:56:15Z");

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

		System.out.println("d04= " + d04.format(fmt1));
		System.out.println("d04= " + fmt1.format(d04));
		System.out.println("d04= " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("d05= " + d05.format(fmt1));
		System.out.println("d05= " + d05.format(fmt2));
		System.out.println("d05= " + d05.format(fmt4));

		// Instant não permite chamar o ".format" a partir da data, apenas pelo
		// formatador, por conta do fuso-horario
		System.out.println("d06= " + fmt3.format(d06));
		System.out.println("d06= " + fmt5.format(d06));
	}

}
