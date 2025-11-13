package Nov1;

import java.util.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("today date "+d);
//		boolean d2=d.after(d);
//		System.out.println(d2);
		LocalDate id =  LocalDate.now();
		LocalDate id1 = LocalDate.of(1998, 11, 21);
		
		System.out.println(id);
		System.out.println(id1);
		LocalDate id2 = LocalDate.parse("1998-11-21");
		System.out.println(id2);
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);
		LocalDateTime td1 = LocalDateTime.now();
		System.out.println(td1);
		LocalDate nextnextweek = ((LocalDate) id).plusWeeks(2);
		System.out.println(nextnextweek);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("DD-MM-YYYY HH:mm");
		String formatted = td1.format(dtf);
		System.out.println(formatted);
		DayOfWeek dayOfWeek = DayOfWeek.from(td1);
		int i=0;
		while(i<30) {
			LocalDate nextDay = ((LocalDate)id).plusDays(i);
			
			DayOfWeek d1 = DayOfWeek.from(nextDay);
			if(d1.name().equals("SATURDAY") || d1.name().equals("SUNDAY")) {
				System.out.println(" date is "+nextDay+" Day of week is "+d1.name());
			}
			i+=1;
		}
		
		
	}
}
