
public class Reverse {

	public static String reverseMe(String argument) {
		String ans = "";

		for (int i = argument.length() - 1; i >= 0; i--) {
			ans += argument.charAt(i);
		}

		return ans;
	}

	public static String reverseEveryChar(String arg) {
		String ans = "";
		String dummyStr;
		for (int i = 0; i < arg.length(); i++) {
			dummyStr = "";
			while (i < arg.length() && arg.charAt(i) != ' ') {
				dummyStr += arg.charAt(i);
				i++;
			}
			ans += reverseMe(dummyStr);
			if (i != arg.length() - 1)
				ans += ' ';
		}

		return ans;
	}

}
