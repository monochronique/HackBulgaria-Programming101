
public class OddOccurence {

	public static int max(int... array) {
		int ans = array[0];

		for (int i : array) {
			if (ans < i)
				ans = i;

		}

		return ans;

	}

	public static int getOddOccurence(int... array) {

		int length = max(array);
		int arr[] = new int[length + 1];

		for (int i : array) {
			arr[i]++;
		}

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				ans = i;
		}
		return ans;

	}

}
