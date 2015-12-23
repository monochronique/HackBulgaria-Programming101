
public class PalindromeScore {

	public static int reverseNumber(int n) {
		int ans = 0;

		while (n != 0) {
			ans += n % 10;
			ans *= 10;
			n /= 10;
		}

		return ans / 10;
	}

	public static int pScore(int n) {
		if (Palindrome.isPalindrome(n))
			return 1;
		else
			return 1 + pScore(n + reverseNumber(n));
	}

}
