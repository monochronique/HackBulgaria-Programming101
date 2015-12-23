
public class Anagram {
 
	public static boolean anagram(String A, String B) {

		if (A.length() != B.length())
			return false;

		StringBuilder sbA = new StringBuilder(A);
		StringBuilder sbB = new StringBuilder(B);

		while (sbA.length() > 0 && sbB.length() > 0 && sbB.indexOf(sbA.substring(0, 1)) >= 0) {
			sbB.deleteCharAt(sbB.indexOf(sbA.substring(0, 1)));
			sbA.deleteCharAt(0);

		}

		return sbA.length() == 0;
	}

	public static boolean hasAnagramOf(String A, String B) {
		if (A.length() > B.length())
			return false;

		for (int i = 0; i < B.length() - A.length() + 1; i++) {
			if (anagram(A, B.substring(i, i + A.length())))
				return true;
		}

		return false;

	}

}
