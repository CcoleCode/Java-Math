import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class DateTime {

	public static void main(String[] args) {
		// How to get today's date: mm/dd/yyyy
		//current time time zone
		//Calculate time elapsed between 2 dates or time
		//Days of the week
		//Months
		LocalDate date = new LocalDate.of(2022, 12, 17);
		//Product created contacts last updated
		LocalDateTime current = LocalDateTime.now(); //Reads it from operating system
		
		//Time elapsed - last seen 53 minutes, last updated 10 days ago
		LocalTime sooner = LocalTime.of(17, 00);
		LocalTime later = LocalTime.of(19, 00);
		Duration duration = Duration.between(sooner, later);
		System.out.println(duration.toHours());
		
		String date_s = "2011-01-18 00:00:00.0";
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		System.out.println(dt.format(date_s));
		
	}

}
