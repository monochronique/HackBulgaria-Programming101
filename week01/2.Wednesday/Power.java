
public class Power {
	public static long pow(int x, int n) {

		if (n < 0) {
			x = 1 / x;
			n = -1 * n;
		}
		if (n == 0)
			return 1;

		long y = 1;
		while (n > 1) {
			if (n % 2 == 0) {
				x *= x;
				n /= 2;

			} else {
				y *= x;
				x *= x;
				n = (n - 1) / 2;
			}
		}
		return x * y;
	}
}
