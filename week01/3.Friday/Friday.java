import java.util.Calendar;

public class Friday {

	private Friday() {
	};

	private static boolean isLeap(int year) {
		return ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0);
	}

	private static boolean isFriday(int year, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, 0, day);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		return dayOfWeek == 6;
	}

	private static boolean isFridayYear(int year) {
		if (isFriday(year, 1) || (isLeap(year) && isFriday(year, 2)))
			return true;
		return false;

	}

	public static int friday_years(int start, int end) {
		int count = 0;

		for (int i = start; i <= end; i++) {
			if (isFridayYear(i))
				count++;
		}

		return count;
	}

}
