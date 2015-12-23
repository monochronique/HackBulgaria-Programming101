import java.math.BigInteger;
import java.util.Vector;

public class SmallestMultiple {

	public static Vector<Integer> getPrimeDelitels(int n) {
		Vector<Integer> ans = new Vector<Integer>();
		int i = 2;

		while (n != 1) {
			if (n % i == 0)
				ans.add(i);
			while (n % i == 0) {
				n /= i;
			}
			i++;

		}

		return ans;
	}

	public static BigInteger getSmallestMultiple(int upperBound) {
		BigInteger ans = new BigInteger("1");
		Vector<Integer> usedDelitels = new Vector<Integer>();
		Vector<Integer> currentDelitels = new Vector<Integer>();
		Vector<Integer> finalDelitels = new Vector<Integer>();

		for (int i = upperBound; i >= 2; i--) {
			currentDelitels = getPrimeDelitels(i);

			for (int j = 0; j < currentDelitels.size(); j++) {

				int currentElement = currentDelitels.get(j);

				if (!usedDelitels.contains(currentElement)) {
					usedDelitels.add(currentElement);
					int finalDelitel = currentElement;
					while (finalDelitel <= upperBound) {
						finalDelitel *= currentElement;
					}

					finalDelitels.add(finalDelitel / currentElement);
				}
			}

		}
		for (int i = 0; i < finalDelitels.size(); i++) {
			ans = ans.multiply(new BigInteger(new Integer(finalDelitels.get(i)).toString()));
		}

		return ans;
	}

}
