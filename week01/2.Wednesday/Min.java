
public class Min {

	public static int min(int... array) {
		int ans = array[0];
		for (int i = 0; i < array.length; i++) {
			if (ans > array[i])
				ans = array[i];
		}

		return ans;
	}

}
