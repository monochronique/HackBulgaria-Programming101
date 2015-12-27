public class Brackets {

	public static boolean isCorrect(String s) {
		if (s.charAt(0) != '(' || s.charAt(s.length() - 1) != ')')
			return false;

		int bracketsNumber = 0;
		for (int i = 0; i < s.length(); i++) {
			if (bracketsNumber < 0)
				return false;
			else if (s.charAt(i) == '(')
				bracketsNumber++;
			else if (s.charAt(i) == ')')
				bracketsNumber--;
		}

		return bracketsNumber == 0;

	}

}
