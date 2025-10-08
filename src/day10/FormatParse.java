package day10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatParse {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		//Date object to String - format
		String formatteddate = dt.format(DateTimeFormatter.
				ofPattern("dd/MM/YYYY hh:mm a"));
		System.out.println(formatteddate);
		
		formatteddate = dt.format(DateTimeFormatter.
				ofPattern("E-M-YYYY hh:mm a"));
		System.out.println(formatteddate);
		
		//String to Date object - parse
		String mydate = "23/09/2025 12:32 PM";
		LocalDateTime mydt = LocalDateTime.parse(mydate,
				DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a"));
		System.out.println(mydt);
		
	}

}
