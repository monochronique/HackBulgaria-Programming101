public class maxEqual {

	public static int maxEqualConsecutive(int[] items) {
		int maxSequence = 1, currentSequence = 1, currentNumber = items[0];

		for (int i = 1; i < items.length; i++) {
			if (currentNumber == items[i])
				currentSequence++;
			else {
				currentNumber = items[i];
				if (maxSequence < currentSequence)
					maxSequence = currentSequence;
				currentSequence = 1;
			}
		}
		if (maxSequence < currentSequence)
			maxSequence = currentSequence;
		return maxSequence;
	}

}
