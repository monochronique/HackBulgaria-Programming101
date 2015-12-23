public class CreditCard {

	public static boolean is_credit_card_valid(String number) {
		if (!number.matches("[0-9]*") || number.length() % 2 == 0)
			return false;
		int sum = 0;
		int currentNumber = 0;
		for (int i = number.length() - 1; i >= 0; i--) {
			currentNumber = Integer.parseInt(Character.toString(number.charAt(i)));
			if ((number.length() - i - 1) % 2 != 0)
				currentNumber *= 2;
			sum += currentNumber;
		}

		System.out.println(sum);
		return sum % 10 == 0;
	}

}
