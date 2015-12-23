
public class SumOfNumbers {

	public static int sumOfNumbers(String input) {
		int sum = 0;
		String currentNumber;
		for (int i = 0; i < input.length(); i++) {
			currentNumber = "";

			while (i < input.length() && Character.isDigit(input.charAt(i))) {
				currentNumber += input.charAt(i);
				i++;
			}

			if (currentNumber.length() > 0)
				sum += Integer.parseInt(currentNumber);

		}

		return sum;
	}

}
