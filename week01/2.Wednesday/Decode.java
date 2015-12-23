
public class Decode {

	public static String decodeUrl(String input) {
		String ans = "";
		String dummy = "";
		for (int i = 0; i < input.length(); i++) {
			dummy = "";
			if (input.charAt(i) == '%') {
				while (i < input.length() && dummy.length() < 3) {
					dummy += input.charAt(i);
					i++;
				}
				if (dummy.equals("%20"))
					ans += ' ';
				else if (dummy.equals("%3A"))
					ans += ':';
				else if (dummy.equals("%3D"))
					ans += '?';
				else if (dummy.equals("%2F"))
					ans += '/';
				else {
					ans += '%';
					i -= 2;
				}
				i -= 1;

			} else
				ans += input.charAt(i);

		}

		return ans;
	}

}
