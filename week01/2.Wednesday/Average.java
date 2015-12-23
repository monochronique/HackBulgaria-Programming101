
public class Average {

	public static float getAverage(int... array) {
		float sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;
	}

}
