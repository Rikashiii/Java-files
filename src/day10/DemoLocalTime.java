package day10;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DemoLocalTime {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime later = LocalTime.of(13, 30);
		System.out.println(later);
		
		System.out.println(now.isAfter(later));
		
		Duration interval= Duration.between(now, later);
		System.out.println(interval);
		System.out.println("Time diff :" + interval.toHoursPart() + " hrs "
		 + interval.toMinutesPart() + " mins");
		
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		
		System.out.println(now.plusHours(2));
		System.out.println(now.plus(1, ChronoUnit.HOURS));
		
	}
}
