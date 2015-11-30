public class isSorted {

	public static boolean isDecreasing(int[] sequence) {

		for (int i = 1; i < sequence.length; i++) {
			if (sequence[i] > sequence[i - 1])
				return false;
		}

		return true;
	}

	public static boolean isIncreasing(int[] sequence) {

		for (int i = 1; i < sequence.length; i++) {
			if (sequence[i] < sequence[i - 1])
				return false;
		}

		return true;
	}

}
