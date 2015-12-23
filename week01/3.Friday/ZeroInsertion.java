import java.util.LinkedList;

public class ZeroInsertion {

	private static LinkedList<Integer> getDigits(int number) {
		LinkedList<Integer> ans = new LinkedList<Integer>();

		while (number != 0) {
			ans.addFirst(number % 10);
			number /= 10;
		}

		return ans;

	}

	public static String zeroInstertion(int number) {
		String ans = "";
		if (number < 0) {
			number *= -1;
			ans += "-";
		}
		LinkedList<Integer> digits = getDigits(number);

		for (int i = 0; i < digits.size(); i++) {
			ans += digits.get(i).toString();
			if (i + 1 < digits.size()
					&& (digits.get(i) == digits.get(i + 1) || ((digits.get(i) + digits.get(i + 1)) % 10 == 0)))
				ans += "0";
		}

		return ans;

	}

}
