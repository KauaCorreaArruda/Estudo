package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2024-08-22");
		LocalDateTime d05 = LocalDateTime.parse("2024-08-22T14:17:30");
		Instant d06 = Instant.parse("2024-08-22T01:18:30Z");

		LocalDate pastDaysLocalDate = d04.minusDays(7);
		LocalDate nextDaysLocalDate = d04.plusDays(7);
		LocalDate nextWeeksLocalDate = d04.plusWeeks(7);
		LocalDate nextMonthsLocalDate = d04.plusMonths(7);
		LocalDate nextYearsLocalDate = d04.plusYears(7);

		System.out.println("pastDaysLocalDate= " + pastDaysLocalDate);
		System.out.println("nextDaysLocalDate= " + nextDaysLocalDate);
		System.out.println("nextWeeksLocalDate= " + nextWeeksLocalDate);
		System.out.println("nextMonthsLocalDate= " + nextMonthsLocalDate);
		System.out.println("nextYearsLocalDate= " + nextYearsLocalDate);

		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.minus(7, ChronoUnit.DAYS);

		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);

		Duration t1 = Duration.between(pastDaysLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);

		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());

	}
}