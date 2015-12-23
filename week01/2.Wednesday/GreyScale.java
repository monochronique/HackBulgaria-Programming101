
public class GreyScale {
	public static int[] histogram(short[][] image) {
		int[] result = new int[256];

		for (int i = 0; i < image.length; i++) {
			for (short j : image[i]) {
				result[j]++;
			}
		}

		return result;

	}
}
