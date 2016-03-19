package week6_Wednesday;

public class InputChecker {

	public interface Validator {
		public boolean validate(String input);
	}

	public static boolean validateName(String input) {
		Validator nameValidator = new Validator() {

			@Override
			public boolean validate(String input) {
				return input.matches("{1}[A-Z][a-z]*{1}[ ]{1}[A-Z][a-z]*");
			}

		};

		return nameValidator.validate(input);
	}

	public static boolean validateCreditNumber(String input) {
		Validator cardNumberValidator = new Validator() {

			@Override
			public boolean validate(String number) {
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

		};
		return cardNumberValidator.validate(input);
	}

	public static boolean validateAge(String input) {

		Validator ageValidator = new Validator() {

			@Override
			public boolean validate(String input) {
				if (!input.matches("[0-9]*"))
					return false;
				Integer age = Integer.parseInt(input);
				if (age < 0 || age >= 150)
					return false;
				return true;
			}

		};

		return ageValidator.validate(input);

	}

	public static boolean validatePhoneNumber(String input) {
		Validator numberValidator = new Validator() {

			@Override
			public boolean validate(String input) {
				input = input.replaceAll(" ", "");
				if (input.startsWith("+359")) {
					if (input.length() == 13 && input.matches("{1}[+359][0-9]*"))
						return true;
					else
						return false;
				} else if (input.startsWith("08")) {
					if (input.length() == 10 && input.matches("[0-9]*"))
						return true;
					return false;
				} else
					return false;

			}

		};

		return numberValidator.validate(input);
	}

	public static boolean validateIPv4(String input) {
		Validator validateIPv4 = new Validator() {

			@Override
			public boolean validate(String input) {
				return input.matches(
						"(([0-1]?[0-9]{1,2}\\.)|(2[0-4][0-9]\\.)|(25[0-5]\\.)){3}(([0-1]?[0-9]{1,2})|(2[0-4][0-9])|(25[0-5]))");
			}

		};

		return validateIPv4.validate(input);
	}

	public static boolean validateIPv6(String input) {
		Validator validateIPv6 = new Validator() {

			@Override
			public boolean validate(String input) {
				return input.matches("[0-9a-f]{1,4}:){7}([0-9a-f]){1,4}");
			}

		};

		return validateIPv6.validate(input);
	}

	public static boolean validateMacAddress(String input) {
		Validator validateMac = new Validator() {

			@Override
			public boolean validate(String input) {
				return input.matches("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
			}

		};

		return validateMac.validate(input);

	}

}
