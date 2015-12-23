import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

public class StoSMS {

	private Map<Integer, String> m = null;
	StoSMS instance = null;

	private StoSMS() {
		m = new HashMap<Integer, String>();
		m.put(2, "abc");
		m.put(3, "def");
		m.put(4, "ghi");
		m.put(5, "jkl");
		m.put(6, "mno");
		m.put(7, "pqrs");
		m.put(8, "tuv");
		m.put(9, "wxyz");
		instance = new StoSMS();

	}

	public StoSMS instanceOf() {

		if (instance == null) {
			instance = new StoSMS();
		}
		return instance;
	}

	public String numbersToMessage(int numbers[]) {

		String ans = "";
		int currentNumber = 0;
		if (numbers.length == 1)
			return ans + m.get(numbers[0]).charAt(0);
		String s = "";
		boolean isNextCapital = false;
		String current = "";
		int currentSequence = 0;
		for (int i = 0; i < numbers.length; i++) {
			current = "";
			currentNumber = numbers[i];
			currentSequence = 0;
			while (i < numbers.length && numbers[i] >= 2 && currentNumber == numbers[i]) {
				i++;
				currentSequence++;
			}
			currentSequence--;
			if (i < numbers.length && numbers[i] >= 2)
				i--;
			if (currentNumber >= 2)
				current = s + m.get(currentNumber).charAt(currentSequence % m.get(currentNumber).length());
			if (isNextCapital) {
				current = current.toUpperCase();
				isNextCapital = false;
			}
			ans += current;
			if (i < numbers.length && numbers[i] == 0)
				ans += " ";
			if (currentNumber == 1)
				isNextCapital = true;
		}
		return ans;
	}

	public LinkedList<Integer> messageToNumbers(String message) {
		LinkedList<Integer> ans = new LinkedList<Integer>();

		int positionOfChar = 0;
		int prevPositionOfChar = 0;
		String lowerCased = "";
		String s = "";

		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) == ' ') {
				ans.addLast(0);
			} else {
				if (Character.isUpperCase(message.charAt(i))) {
					ans.addLast(1);
				}

				lowerCased = s + Character.toLowerCase(message.charAt(i));

				for (int j = 2; j <= 9; j++) {
					if (m.get(j).contains(lowerCased))
						positionOfChar = j;
				}
				if (i > 0 && prevPositionOfChar == positionOfChar)
					ans.addLast(-1);

				for (int k = 0; k <= m.get(positionOfChar).indexOf(lowerCased); k++) {
					ans.addLast(positionOfChar);
				}
				prevPositionOfChar = positionOfChar;

			}

		}

		return ans;
	}

}
