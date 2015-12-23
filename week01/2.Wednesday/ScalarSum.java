import java.util.Arrays;

public class ScalarSum {

	public static long maximalScalarSum(int[] a, int[] b) {
		long ans = 0;
		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0; i < a.length; i++) {
			ans += a[i] * b[i];
		}

		return ans;
	}

}
