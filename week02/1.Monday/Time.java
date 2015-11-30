import java.util.Calendar;
import java.util.Date;

public class Time {
	private int hour = 0, minute = 0, second = 0, day = 1, month = 1,
			year = 1900;

	Time(int hour, int minute, int second, int day, int month, int year) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.day = day;
		this.month = month;
		this.year = year;

	}

	@Override
	public String toString() {
		return String.format("%d:%d:%d %d:%d:%d", hour, minute, second, day,
				month, year);
	}

	@SuppressWarnings("deprecation")
	public static Time now() {
		Calendar currentTime = Calendar.getInstance();
		Date d = currentTime.getTime();
		return new Time(d.getHours(), d.getMinutes(), d.getSeconds(),
				d.getDate(), d.getMonth(), 1900 + d.getYear());
	}

}
