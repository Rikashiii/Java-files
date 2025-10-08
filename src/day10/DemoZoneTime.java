package day10;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DemoZoneTime {

	public static void main(String[] args) {
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		System.out.println(zones);
		
		ZonedDateTime ist = ZonedDateTime.of
				(LocalDateTime.now(), ZoneId.of("Asia/Kolkata"));
		System.out.println(ist);
		
		ZonedDateTime london = ZonedDateTime.of
				(LocalDateTime.now(), ZoneId.of("Europe/London"));
		System.out.println(london);
		
		Duration diff = Duration.between(ist, london);
		System.out.println(diff);
		
		LocalDateTime istlocal = ist.toLocalDateTime();
		london = ist.toInstant().atZone(ZoneId.of("Europe/London"));
		LocalDateTime londonlocal = london.toLocalDateTime();
		
		diff = Duration.between(istlocal, londonlocal);
		System.out.println(diff);

	}

}
