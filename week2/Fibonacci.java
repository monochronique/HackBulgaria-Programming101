public class Fibonacci {
	public static int fib(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 1;

		else
			return fib(n - 2) + fib(n - 1);

	}

	public static String fibNumber(int n) {
		String ans = "";

		for (int i = 1; i <= n; i++) {
			ans += fib(i);

		}

		return ans;
	}

}
