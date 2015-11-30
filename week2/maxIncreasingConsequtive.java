public class maxIncreasingConsequtive {

	public static int maxIncreasingConseq(int[] items) {
		int maxSequence = 1, currentSequence = 1;

		for (int i = 0; i < items.length; i++) {
			while (i < items.length - 1 && items[i] <= items[i + 1]) {
				currentSequence++;
				i++;
			}
			if (maxSequence < currentSequence)
				maxSequence = currentSequence;
			currentSequence = 1;
		}

		return maxSequence;
	}

}
