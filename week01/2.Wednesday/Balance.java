
public class Balance {
	public static boolean canBalance(int numbers[]) {
		int leftSum = 0, rightSum = 1, index = 1;
		while (leftSum != rightSum && index < numbers.length) {
			leftSum = 0;
			rightSum = 0;
			for (int i = 0; i < index; i++) {
				leftSum += numbers[i];
			}

			for (int i = index; i < numbers.length; i++) {
				rightSum += numbers[i];
			}

			index++;
		}

		return leftSum == rightSum;

	}
}
