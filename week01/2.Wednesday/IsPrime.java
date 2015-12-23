
public class IsPrime {
	public static boolean isPrime(int n) {
		int i = 2;
		while (n % i != 0 && i < n / 2) {
			i++;
		}

		return true;
	}
}
