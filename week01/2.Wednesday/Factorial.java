import java.math.BigInteger;

public class Factorial {
	public static long fact(int n) {
		int ans = 1;
		for (int i = 2; i <= n; i++) {
			ans *= i;
		}
		return ans;
	}

	public static long doubleFact(int n) {
		return fact((int) fact(n));
	}

	public static BigInteger kthFact(int k, int n) {

		BigInteger ans = new BigInteger(new Integer(n).toString());
		BigInteger one = new BigInteger("1");

		for (int i = 0; i < k; i++) {
			BigInteger dummy = new BigInteger(ans.toString());
			BigInteger j = new BigInteger(dummy.subtract(one).toString());
			while (j.compareTo(one) != 0) {

				ans = ans.multiply(j);
				j = j.subtract(one);
			}
		}

		return ans;
	}

}
