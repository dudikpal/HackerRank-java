package interviewpreparationkit.oneweekpreparationkit.day1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeConversion {

	public static String timeConversion(String s) {
		// Write your code here
		LocalTime time = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US));
		return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	}

	public static void main(String[] args) {
		System.out.println(timeConversion("12:01:00PM"));
		System.out.println(timeConversion("12:01:00AM"));
		System.out.println(timeConversion("07:05:45PM"));
	}
}
