package day10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DemoLocalDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate diwali = LocalDate.of(2025, 10, 20);
		System.out.println(diwali);
		
		System.out.println(today.isBefore(diwali));
		
		Period timeleft = today.until(diwali);
		System.out.println(timeleft);
		
		System.out.println("Time left for diwali :" + timeleft.getYears() + " year(s) " 
		+ timeleft.getMonths() + " month(s) "+ timeleft.getDays() + "day(s) ");
		
		System.out.println("--------------------------");
		System.out.println(diwali.getDayOfWeek());
		System.out.println(diwali.getDayOfMonth());
		System.out.println(diwali.getDayOfYear());
		
		System.out.println(diwali.getMonthValue());
		System.out.println(diwali.getMonth());
		
		System.out.println(diwali.getYear());
		
		System.out.println("--------------------------");
		LocalDate tomorrow = today.plusDays(1);
		System.out.println(tomorrow);
		
		LocalDate yesterday = today.minusDays(1);
		System.out.println(yesterday);
		
		LocalDate dayafter = today.plus(2, ChronoUnit.DAYS);
		System.out.println(dayafter);
		
		System.out.println("--------------------------");
		LocalDate start = LocalDate.of(2025,1, 1);
		LocalDate end = LocalDate.of(2026,1, 1);
		Stream<LocalDate> wholeyear = start.datesUntil(end);
		Predicate<LocalDate> firstsunday = (d) -> d.getDayOfMonth() ==1
				&& d.getDayOfWeek().equals(DayOfWeek.SUNDAY);
		wholeyear.filter(firstsunday).forEach(System.out::println);
		
		System.out.println("--------------------------");
		
		LocalDate firstdaynextmonth = diwali.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println(firstdaynextmonth);
		
		LocalDate secondsat = diwali.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SATURDAY));
		System.out.println(secondsat);
		
		LocalDate tuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println(tuesday);
		
		tuesday = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
		System.out.println(tuesday);
		

	}

}
