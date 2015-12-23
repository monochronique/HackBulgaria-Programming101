
public class Palindrome {

	public static int getDigits(long n) {
		int ans = 0;
		while (n != 0) {
			ans++;
			n /= 10;
		}

		return ans;

	}

	public static boolean isPalindrome(long n) {
		int length = getDigits(n);
		int i = 0;

		while (i != length / 2) {

			if ((n / ((long) Math.pow(10, i)) % 10) != n / ((long) Math.pow(10, length - i - 1)) % 10)
				return false;
			i++;

		}

		return true;

	}

	public static boolean isPalindrome(int n) {
		int length = getDigits(n);
		int i = 0;

		while (i != length / 2) {

			if ((n / ((long) Math.pow(10, i)) % 10) != n / ((long) Math.pow(10, length - i - 1)) % 10)
				return false;
			i++;

		}

		return true;

	}

	public static boolean isPalindrome(String s) {
		int i = 0;

		while (i != s.length() / 2 && s.charAt(i) == s.charAt(s.length() - i - 1)) {
			i++;
		}

		return i == s.length() / 2;

	}

	public static long getLargestPalindrome(long N) {
		while (!isPalindrome(N)) {
			N--;
		}
		return N;

	}

	public static int getPalindromeLength(String input) {
		StringBuilder sb = new StringBuilder(input);

		while (!isPalindrome(sb.toString()) && sb.length() != 0) {
			sb.deleteCharAt(0);
			sb.deleteCharAt(sb.length() - 1);
		}
		return (sb.length() - 1) / 2;
	}

}
