
public class CopyEveryChar {

	public static String copyEveryChar(String input, int k) {
		String ans = "";

		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < k; j++) {
				ans += input.charAt(i);
			}
		}

		return ans;
	}

}
