
public class Span {

	public static int maxSpan(int[] numbers) {
		int ans = 0;

		for (int i = 0; i < numbers.length; i++) {
			int backwardCounter = numbers.length - 1;
			while (backwardCounter > i && numbers[backwardCounter] != numbers[i]) {
				backwardCounter--;
			}

			if (backwardCounter - i + 1 > ans)
				ans = backwardCounter - i + 1;

		}

		return ans;
	}

}
