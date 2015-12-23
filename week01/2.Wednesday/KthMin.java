import java.util.Arrays;

public class KthMin {
	public static int kthMin(int k, int... array) {
		Arrays.sort(array);
		return array[k - 1];

	}

}
