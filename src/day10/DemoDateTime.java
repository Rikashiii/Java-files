package day10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DemoDateTime {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		
		LocalDateTime dt1 = today.atTime(LocalTime.of(12, 00));
		System.out.println(dt1);
		
		LocalDateTime dt2 = now.atDate(LocalDate.of(2025, 1, 1));
		System.out.println(dt2);

	}

}
